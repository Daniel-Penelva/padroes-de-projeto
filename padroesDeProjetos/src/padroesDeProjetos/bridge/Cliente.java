package padroesDeProjetos.bridge;

public class Cliente {

	public static void main(String[] args) {
		
		Renderizador renderizadorSVG = new RenderizadorSVG(){	
		};
		
		Renderizador renderizadorTela = new RenderizadorTela() {
		};
		
		Forma circulo = new Circulo(5, renderizadorSVG);
		circulo.desenhar();
		
		Forma retangulo = new Retangulo(10, 20, renderizadorTela);
		retangulo.desenhar();
		
	}
}
