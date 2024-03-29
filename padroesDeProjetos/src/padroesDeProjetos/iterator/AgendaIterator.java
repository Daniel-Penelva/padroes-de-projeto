package padroesDeProjetos.iterator;

import java.util.List;

//Implementação Concreta do Iterador para a Agenda
public class AgendaIterator implements Iterator<Contato> {

	private List<Contato> contatos;
	private int indice = 0;

	public AgendaIterator(List<Contato> contatos) {
		super();
		this.contatos = contatos;
	}

	@Override
	public boolean hasNext() {
		return indice < contatos.size(); // contatos.size() é o valor total de contatos criados 
	}

	// Para cada contato imprimido é incrementado mais um no indice 
	@Override
	public Contato next() {
		if (hasNext()) {
			Contato contato = contatos.get(indice);
			indice++;
			return contato;
		}
		return null;
	}

}
