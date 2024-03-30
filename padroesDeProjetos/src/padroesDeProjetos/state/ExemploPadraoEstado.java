package padroesDeProjetos.state;

public class ExemploPadraoEstado {

	public static void main(String[] args) {

		MaquinaDeVenda maquinaDeVenda = new MaquinaDeVenda();

		maquinaDeVenda.selecionarBebida(); // Output: Por favor, insira uma moeda primeiro

		maquinaDeVenda.inserirMoeda(); // Output: Moeda inserida
		maquinaDeVenda.selecionarBebida(); // Output: Bebida selecionada

		maquinaDeVenda.dispensar(); // Output: Bebida dispensada

	}

}
