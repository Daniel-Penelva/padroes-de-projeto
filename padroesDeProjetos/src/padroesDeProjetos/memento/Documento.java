package padroesDeProjetos.memento;

public class Documento {

	private String conteudo;

	public Documento() {
		this.conteudo = "";
	}

	public void escrever(String texto) {
		this.conteudo = texto;
	}

	// Salva o estado atual do conteúdo. Retorna um objeto Memento que contém o estado atual do conteúdo.
	public Memento salvar() {
		return new Memento(conteudo);
	}

	// captura o estado salvo e atualiza o conteúdo do documento com esse estado.
	public void restaurar(Memento memento) {
		conteudo = memento.getEstadoSalvo();
	}

	// getters e setters
	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

}
