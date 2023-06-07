package padroesDeProjetos.builder;

public class Casa {

	private int numerosQuartos;
	private int tamanhoJardim;
	// Outros atributos de casa ...

	public Casa(int numerosQuartos, int tamanhoJardim) {
		super();
		this.numerosQuartos = numerosQuartos;
		this.tamanhoJardim = tamanhoJardim;
		// inicialização de outros atributos ...
	}

	// Métodos getters e setters para os atributos
	public int getNumerosQuartos() {
		return numerosQuartos;
	}

	public void setNumerosQuartos(int numerosQuartos) {
		this.numerosQuartos = numerosQuartos;
	}

	public int getTamanhoJardim() {
		return tamanhoJardim;
	}

	public void setTamanhoJardim(int tamanhoJardim) {
		this.tamanhoJardim = tamanhoJardim;
	}

}
