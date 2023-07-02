package padroesDeProjetos.decorator;

public class TetoSolar implements Carro {
	
	private Carro carro;
	
	public TetoSolar(Carro carro) {
		this.carro = carro;
	}

	@Override
	public void montar() {
		carro.montar();
		System.out.println("Adicionando teto solar.");
	}
}
