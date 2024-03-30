package padroesDeProjetos.templateMethod;

public class Cliente {

	public static void main(String[] args) {

		Relatorio relatorioVendas = new RelatorioVendas();
		relatorioVendas.gerarRelatorio();

		Relatorio relatorioEstoque = new RelatorioEstoque();
		relatorioEstoque.gerarRelatorio();

	}

}
