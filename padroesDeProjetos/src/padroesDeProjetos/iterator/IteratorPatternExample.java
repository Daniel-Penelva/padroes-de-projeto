package padroesDeProjetos.iterator;

public class IteratorPatternExample {

	public static void main(String[] args) {

		Agenda agenda = new Agenda();

		agenda.addContato(new Contato("João", "0123456789"));
		agenda.addContato(new Contato("Maria", "9876543210"));
		agenda.addContato(new Contato("Pedro", "5678912340"));

		// Cria um iterador para percorrer os contatos na agenda
		Iterator<Contato> iterator = agenda.criarIterator();

		// Percorre e imprime os contatos da agenda
		while (iterator.hasNext()) {
			Contato contato = iterator.next();
			System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getNumero());
		}

	}

}
