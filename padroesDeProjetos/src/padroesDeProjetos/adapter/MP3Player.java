package padroesDeProjetos.adapter;

public class MP3Player implements Player {

	@Override
	public void play(String filename) {
		System.out.println("Reproduzindo arquivo MP3: " + filename);
	}

	@Override
	public void stop() {
		System.out.println("Parando reprodução do arquivo MP3. ");
	}

}
