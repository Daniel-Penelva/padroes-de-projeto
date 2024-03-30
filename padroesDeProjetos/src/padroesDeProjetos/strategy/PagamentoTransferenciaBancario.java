package padroesDeProjetos.strategy;

public class PagamentoTransferenciaBancario implements Pagamento {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento com transferência bancária: R$ " + valor);

	}

}
