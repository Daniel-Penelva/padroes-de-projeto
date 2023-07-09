package padroesDeProjetos.facade;

public class FachadaReprodutorDeMusica {
	
	private ReprodutorDeAudio reprodutorDeaudio;
	private ReprodutorDeVideo reprodutorDeVideo;
	private CodificadorDeAudio codificadorDeAudio;
	private CodificadorDeVideo codificadorDeVideo;

	public FachadaReprodutorDeMusica() {
		reprodutorDeaudio = new ReprodutorDeAudio();
		reprodutorDeVideo = new ReprodutorDeVideo();
		codificadorDeAudio = new CodificadorDeAudio();
		codificadorDeVideo = new CodificadorDeVideo();
	}

	public void reproduzirMusica(String arquivo) {
		String tipo = arquivo.substring(arquivo.lastIndexOf(".") + 1);

		if (tipo.equalsIgnoreCase("mp3") || tipo.equalsIgnoreCase("wav")) {
			reprodutorDeaudio.reproduzir(arquivo);
		} else if (tipo.equalsIgnoreCase("mp4") || tipo.equalsIgnoreCase("avi")) {
			reprodutorDeVideo.reproduzir(arquivo);
		} else {
			System.out.println("Formato de arquivo não suportado!");
		}
	}

}
