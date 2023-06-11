package padroesDeProjetos.factoryMethod;

public class FabricaCarro extends FabricaVeiculos{

	@Override
	public Veiculo factoryMethod() {
		return new Carro();
	}
}
