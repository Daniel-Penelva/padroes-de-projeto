package padroesDeProjetos.memento;

public class Cliente {

	public static void main(String[] args) {

		Documento documento = new Documento();
		Historico historico = new Historico();

		documento.escrever("Primeiro parte do texto");
		historico.salvarEstado(documento);

		documento.escrever("Segunda parte do texto");
		historico.salvarEstado(documento);

		System.out.println("Conteúdo atual: " + documento.getConteudo());

		historico.desfazer(documento);

		System.out.println("Conteúdo após desfazer: " + documento.getConteudo());

	}

}
