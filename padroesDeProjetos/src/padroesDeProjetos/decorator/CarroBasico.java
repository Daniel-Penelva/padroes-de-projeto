package padroesDeProjetos.decorator;

public class CarroBasico implements Carro {

	@Override
	public void montar() {
		System.out.println("Montando carro básico.");
	}
}
