package padroesDeProjetos.ChainOfResponsibility;

public class FuncionarioAprovador implements Aprovador {
	
	private double limite;
	private Aprovador proximoAprovador;
	
	public FuncionarioAprovador(double limite) {
		this.limite = limite;
	}

	@Override
	public void setProximoAprovador(Aprovador proximoAprovador) {
		this.proximoAprovador = proximoAprovador;
	}

	@Override
	public void aprovar(Despesa despesa) {
		
		if(despesa.getValor() <= limite) {
			System.out.println("Despesa aprovada pelo Funcionário");
			
		}else if(proximoAprovador != null) {
			proximoAprovador.aprovar(despesa);
			
		}else {
			System.out.println("Nenhum aprovador disponível para aprovar a despesa");
		}
	}

}
