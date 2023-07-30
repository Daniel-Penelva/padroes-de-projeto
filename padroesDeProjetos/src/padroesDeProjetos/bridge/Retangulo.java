package padroesDeProjetos.bridge;

public class Retangulo extends Forma{
	
	private int largura;
	private int altura;

	public Retangulo(int largura, int altura, Renderizador renderizador) {
		super(renderizador);
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public void desenhar() {
		renderizador.renderizarRetangulo(largura, altura);
	}
}
