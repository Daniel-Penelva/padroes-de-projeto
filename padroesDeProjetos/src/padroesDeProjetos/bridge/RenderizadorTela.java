package padroesDeProjetos.bridge;

public abstract class RenderizadorTela implements Renderizador {

	@Override
	public void renderizarCirculo(int raio) {
		System.out.println("Renderizando círculo em SVG com raio " + raio);
	}

	@Override
	public void renderizarRetangulo(int largura, int altura) {
		System.out.println("Renderizando retangulo em SVG com largura " + largura + " altura " + altura);
	}
}
