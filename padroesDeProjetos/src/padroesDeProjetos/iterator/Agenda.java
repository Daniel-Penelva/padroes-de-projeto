package padroesDeProjetos.iterator;

import java.util.ArrayList;
import java.util.List;

//Implementação Concreta da Agenda como uma Coleção de Contatos
public class Agenda implements Aggregate<Contato> {

	private List<Contato> contatos = new ArrayList<>();

	// adicionar um contato à agenda
	public void addContato(Contato contato) {
		contatos.add(contato);
	}

	// Cria um iterador para percorrer os contatos na agenda
	@Override
	public Iterator<Contato> criarIterator() {

		return new AgendaIterator(contatos);
	}

}
