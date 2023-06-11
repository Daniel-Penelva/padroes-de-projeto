package padroesDeProjetos.factoryMethod;

public class FabricaBicicleta extends FabricaVeiculos{

	@Override
	public Veiculo factoryMethod() {
		return new Bicicleta();
	}
}
