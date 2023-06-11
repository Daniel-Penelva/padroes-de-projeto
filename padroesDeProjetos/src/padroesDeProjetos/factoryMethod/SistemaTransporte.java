package padroesDeProjetos.factoryMethod;

public class SistemaTransporte {

	public static void main(String[] args) {
		
		FabricaVeiculos fabricaCarro = new FabricaCarro();
		Veiculo carro = fabricaCarro.factoryMethod();
		carro.acelerar();
		System.out.println("Sinal vermelho");
		carro.frear();
		
		System.out.println("---------------- // ----------------");
		
		FabricaVeiculos fabricaBicicleta = new FabricaBicicleta();
		Veiculo bicicleta = fabricaBicicleta.factoryMethod();
		bicicleta.acelerar();
		System.out.println("Carro Passando");
		bicicleta.frear();

	}

}
