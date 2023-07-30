package padroesDeProjetos.bridge;

public class Circulo extends Forma{
	
	private int raio;

	public Circulo(int raio, Renderizador renderizador) {
		super(renderizador);
		this.raio = raio;
	}

	@Override
	public void desenhar() {
		renderizador.renderizarCirculo(raio);
	}
}
