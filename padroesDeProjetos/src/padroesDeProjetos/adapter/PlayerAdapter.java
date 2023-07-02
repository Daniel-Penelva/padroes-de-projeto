package padroesDeProjetos.adapter;

public class PlayerAdapter implements AudioPlayer {
	
	Player player;
	
	//Construtor
	public PlayerAdapter(Player player) {
		this.player = player;
	}

	@Override
	public void playAudio(String filename) {
		player.play(filename);
	}

	@Override
	public void stopAudio() {
		player.stop();
	}
}
