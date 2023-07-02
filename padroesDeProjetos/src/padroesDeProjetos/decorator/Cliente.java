package padroesDeProjetos.decorator;

public class Cliente {

	public static void main(String[] args) {
		
		Carro carroBasico = new CarroBasico();
		carroBasico.montar();
		
		Carro carroComTetoSolar = new TetoSolar(carroBasico);
		carroComTetoSolar.montar();
		
		Carro carroComArCondicionado = new ArCondicionado(carroBasico);
		carroComArCondicionado.montar();
		
		Carro carroComTetoSolarEArCondicionado = new ArCondicionado(new TetoSolar(carroBasico));
		carroComTetoSolarEArCondicionado.montar();

	}

}
