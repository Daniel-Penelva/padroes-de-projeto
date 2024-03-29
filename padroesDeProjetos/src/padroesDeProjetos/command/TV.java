package padroesDeProjetos.command;

public class TV {

	private int volume;

	public void ligar() {
		System.out.println("TV ligada!");
	}

	public void desligar() {
		System.out.println("TV desligada!");
	}

	public void aumentarVolume() {
		volume++;
		System.out.println("Volume aumentado para " + volume);
	}

	public void diminuirVolume() {
		volume--;
		System.out.println("Volume diminuido para " + volume);
	}

}
