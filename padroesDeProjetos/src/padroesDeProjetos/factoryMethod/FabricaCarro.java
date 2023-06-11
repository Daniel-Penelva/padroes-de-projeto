package padroesDeProjetos.factoryMethod;

public class FabricaCarro extends FabricaVeiculos{

	// Implementando a Classe abstrata para a Fabrica carro
	@Override
	public Veiculo factoryMethod() {
		return new Carro();
	}
}
