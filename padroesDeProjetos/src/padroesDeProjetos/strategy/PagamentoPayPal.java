package padroesDeProjetos.strategy;

public class PagamentoPayPal implements Pagamento {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento com PayPal: R$ " + valor);

	}

}
