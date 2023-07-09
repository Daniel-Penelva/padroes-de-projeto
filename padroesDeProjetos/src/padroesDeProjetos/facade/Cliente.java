package padroesDeProjetos.facade;

public class Cliente {

	public static void main(String[] args) {
		
		FachadaReprodutorDeMusica fachada = new FachadaReprodutorDeMusica();
		fachada.reproduzirMusica("musica.mp3");
		fachada.reproduzirMusica("musica.mp4");
		fachada.reproduzirMusica("documento.pdf");
	}

}
