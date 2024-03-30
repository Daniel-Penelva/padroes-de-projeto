package padroesDeProjetos.templateMethod;

public abstract class Relatorio {

	/* Ao invés de chamar um método de cada vez, ou seja, ao invés de chamar o método gerarCabecalho(), gerarCorpo() e gerarRodape(), vou
	 * criar esse método gerarRelatorio para chamar todos de uma vez só. */ 
	public final void gerarRelatorio() {
		gerarCabecalho();
		gerarCorpo();
		gerarRodape();
	}

	protected abstract void gerarCabecalho();

	protected abstract void gerarCorpo();

	protected abstract void gerarRodape();

}
