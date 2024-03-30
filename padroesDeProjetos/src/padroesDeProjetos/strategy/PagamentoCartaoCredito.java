package padroesDeProjetos.strategy;

public class PagamentoCartaoCredito implements Pagamento {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento com cartão de crédito: R$ " + valor);
	}

}
