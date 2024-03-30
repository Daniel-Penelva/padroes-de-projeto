package padroesDeProjetos.strategy;

public class Cliente {
	
	public static void main(String[] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		Pagamento cartaoCredito = new PagamentoCartaoCredito();
		Pagamento payPal = new PagamentoPayPal();
		Pagamento transferenciaBancaria = new PagamentoTransferenciaBancario();
		
		carrinho.setEstrategiaPagamento(cartaoCredito);
		carrinho.processarPagamento(100.0);
		
		carrinho.setEstrategiaPagamento(payPal);
		carrinho.processarPagamento(50.0);
		
		carrinho.setEstrategiaPagamento(transferenciaBancaria);
		carrinho.processarPagamento(200.0);
		
	}

}
