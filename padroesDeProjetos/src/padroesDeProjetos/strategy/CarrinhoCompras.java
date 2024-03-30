package padroesDeProjetos.strategy;

public class CarrinhoCompras {
	
	private Pagamento estrategiaPagamento;
	
	// Atribuindo o valor do tipo de forma de pagamento
	public void setEstrategiaPagamento(Pagamento estrategiaPagamento) {
		this.estrategiaPagamento = estrategiaPagamento;
	}
	
	public void processarPagamento(double valor) {
		estrategiaPagamento.processarPagamento(valor);
	}

}
