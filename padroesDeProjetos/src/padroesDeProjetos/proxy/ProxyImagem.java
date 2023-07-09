package padroesDeProjetos.proxy;

public class ProxyImagem implements Imagem {
	
	private String arquivo;
	private ImagemReal imagemReal;
	
	public ProxyImagem(String arquivo) {
		this.arquivo = arquivo;
	}

	@Override
	public void exibir() {
		if(imagemReal == null) {
			imagemReal = new ImagemReal(arquivo);
		}
		imagemReal.exibir();
	}

}
