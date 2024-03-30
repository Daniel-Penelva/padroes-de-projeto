package padroesDeProjetos.templateMethod;

public class RelatorioVendas extends Relatorio {

	@Override
	protected void gerarCabecalho() {
		System.out.println("Relatório de Vendas - Cabeçalho");

	}

	@Override
	protected void gerarCorpo() {
		System.out.println("Relatório de Vendas - Corpo");

	}

	@Override
	protected void gerarRodape() {
		System.out.println("Relatório de Vendas - Rodapé");

	}

}
