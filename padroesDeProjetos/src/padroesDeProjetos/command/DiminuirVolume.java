package padroesDeProjetos.command;

public class DiminuirVolume implements Comando {
	
	private TV tv;
	
	public DiminuirVolume(TV tv) {
		this.tv = tv;
	}

	@Override
	public void executar() {
		tv.diminuirVolume();
	}

	@Override
	public void desfazer() {
		tv.aumentarVolume();
	}

}
