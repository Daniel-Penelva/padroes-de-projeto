package padroesDeProjetos.adapter;

public class Cliente {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new PlayerAdapter(new MP3Player());
		audioPlayer.playAudio("musica.mp3");
		
		audioPlayer.stopAudio();
		
		audioPlayer = new PlayerAdapter(new WAVPlayer());
		audioPlayer.playAudio("audio.wav");
		
		audioPlayer.stopAudio();
	}

}
