package padroesDeProjetos.templateMethod;

public class RelatorioEstoque extends Relatorio{

	@Override
	protected void gerarCabecalho() {
		System.out.println("Relatório de Estoque - Cabeçalho");
		
	}

	@Override
	protected void gerarCorpo() {
		System.out.println("Relatório de Estoque - Corpo");
		
	}

	@Override
	protected void gerarRodape() {
		System.out.println("Relatório de Estoque - Rodapé");
		
	}

}
