package padroesDeProjetos.factoryMethod;

public class FabricaBicicleta extends FabricaVeiculos{

	// Implementando a Classe abstrata para a Fabrica bicicleta
	@Override
	public Veiculo factoryMethod() {
		return new Bicicleta();
	}
}
