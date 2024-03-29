package padroesDeProjetos.command;

public class LigarTV implements Comando {

	private TV tv;

	public LigarTV(TV tv) {
		this.tv = tv;
	}

	@Override
	public void executar() {
		tv.ligar();
	}

	@Override
	public void desfazer() {
		tv.desligar();
	}

}
