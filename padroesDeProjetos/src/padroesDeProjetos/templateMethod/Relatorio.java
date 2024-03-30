package padroesDeProjetos.templateMethod;

public abstract class Relatorio {

	public final void gerarRelatorio() {
		gerarCabecalho();
		gerarCorpo();
		gerarRodape();
	}

	protected abstract void gerarCabecalho();

	protected abstract void gerarCorpo();

	protected abstract void gerarRodape();

}
