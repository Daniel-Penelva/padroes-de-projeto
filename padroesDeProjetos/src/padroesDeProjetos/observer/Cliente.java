package padroesDeProjetos.observer;

public class Cliente {

	public static void main(String[] args) {

		Sujeito sujeito = new Sujeito();

		Dispositivo dispositivo1 = new Dispositivo("Dispositivo 1");
		Dispositivo dispositivo2 = new Dispositivo("Dispositivo 2");
		Dispositivo dispositivo3 = new Dispositivo("Dispositivo 3");

		sujeito.adicionarObservadores(dispositivo1);
		sujeito.adicionarObservadores(dispositivo2);
		sujeito.adicionarObservadores(dispositivo3);

		sujeito.setTemperatura(25);
		sujeito.setTemperatura(35);

		sujeito.removerObservadores(dispositivo2);

		sujeito.setTemperatura(35);

	}

}
