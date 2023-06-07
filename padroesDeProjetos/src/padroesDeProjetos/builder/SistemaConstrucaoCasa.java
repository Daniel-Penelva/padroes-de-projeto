package padroesDeProjetos.builder;

public class SistemaConstrucaoCasa {

	public static void main(String[] args) {
		
		CasaBuilder builder = new CasaBuilder();
		
		Casa casa1 = builder.comNumeroQuarto(4).comTamanhoJardim(200).construir();
		System.out.println("Casa - Número de quartos: " + casa1.getNumerosQuartos() + " Tamanho do jardim: " + casa1.getTamanhoJardim());
		
		Casa casa2 = builder.comNumeroQuarto(3).construir();
		System.out.println("Casa - Número de quartos: " + casa2.getNumerosQuartos());
		
		Casa casa3 = builder.comTamanhoJardim(500).construir();
		System.out.println("Casa - Tamanho do jardim: " + casa3.getTamanhoJardim());
	}

}
