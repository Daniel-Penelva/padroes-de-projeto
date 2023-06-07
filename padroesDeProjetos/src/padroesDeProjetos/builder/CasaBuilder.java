package padroesDeProjetos.builder;

public class CasaBuilder {
	
	private int numeroQuartos;
	private int tamanhoJardim;
	// Outros atributos do builder ...
	
	public CasaBuilder() {
		// Valores padrão para os atributos opcionais.
		this.numeroQuartos = 0;
		this.tamanhoJardim = 0;
		// Inicialização de outros atributos do builder ...
	}
	
	public CasaBuilder comNumeroQuarto(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
		return this;
	}
	
	public CasaBuilder comTamanhoJardim(int tamanhoJardim) {
		this.tamanhoJardim = tamanhoJardim;
		return this;
	}
	
	// Métodos para configurar outros atributos adicionais ...
	
	public Casa construir(){
		return new Casa(numeroQuartos, tamanhoJardim);
	}
	
	

}
