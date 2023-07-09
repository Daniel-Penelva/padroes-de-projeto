package padroesDeProjetos.proxy;

public class Cliente {

	public static void main(String[] args) {
		
		Imagem imagem = new ProxyImagem("imagem.jpg");
		imagem.exibir();
	}

}
