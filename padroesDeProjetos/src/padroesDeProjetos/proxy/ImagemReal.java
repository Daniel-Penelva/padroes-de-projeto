package padroesDeProjetos.proxy;

public class ImagemReal implements Imagem {
	
	private String arquivo;
	
	public ImagemReal(String arquivo) {
		this.arquivo = arquivo;
		carregarImagem();
	}

	private void carregarImagem() {
		
		// Simula o carregamento da imagem pesada
		System.out.println("Carregando imagem: " + arquivo);
	}

	@Override
	public void exibir() {
		// Exibir a imagem carregada
		System.out.println("Exibindo a imagem: " + arquivo);
	}

}
