package padroesDeProjetos.prototype;

public class Celula implements Cloneable {
	
	private String tipo;

	// Construtor
	public Celula(String tipo) {
		super();
		this.tipo = tipo;
	}
	

	// Método setters e getters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// Método clone() que faz a clonagem do objeto
	public Celula clone() throws CloneNotSupportedException{
		return (Celula) super.clone();
	}
}
