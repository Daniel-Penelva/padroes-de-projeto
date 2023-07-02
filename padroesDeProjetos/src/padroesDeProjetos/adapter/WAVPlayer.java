package padroesDeProjetos.adapter;

public class WAVPlayer implements Player {

	@Override
	public void play(String filename) {
		System.out.println("Reproduzindo arquivo WAV: " + filename);

	}

	@Override
	public void stop() {
		System.out.println("Reproduzindo arquivo WAV");

	}

}
