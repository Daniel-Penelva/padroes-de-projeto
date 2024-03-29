package padroesDeProjetos.command;

public class DesligarTV implements Comando {

	private TV tv;

	public DesligarTV(TV tv) {
		this.tv = tv;
	}

	@Override
	public void executar() {
		tv.desligar();
	}

	@Override
	public void desfazer() {
		tv.ligar();
	}

}
