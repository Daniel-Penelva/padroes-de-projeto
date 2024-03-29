package padroesDeProjetos.command;

public class AumentarVolume implements Comando {
	
	private TV tv;
	
	public AumentarVolume(TV tv) {
		this.tv = tv;
	}

	@Override
	public void executar() {
		tv.aumentarVolume();
	}

	@Override
	public void desfazer() {
		tv.diminuirVolume();
	}

}
