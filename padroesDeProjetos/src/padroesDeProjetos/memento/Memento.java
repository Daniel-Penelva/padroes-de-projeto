package padroesDeProjetos.memento;

public class Memento {

	private String estadoSalvo;
	
	public Memento(String estadoSalvo) {
		this.estadoSalvo = estadoSalvo;
	}
	
	public String getEstadoSalvo() {
		return estadoSalvo;
	}
}
