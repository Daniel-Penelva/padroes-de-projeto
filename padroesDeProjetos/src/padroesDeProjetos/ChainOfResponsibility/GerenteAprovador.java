package padroesDeProjetos.ChainOfResponsibility;

public class GerenteAprovador implements Aprovador{

	private double limite;
	private Aprovador proximoAprovador;
	
	public GerenteAprovador(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void setProximoAprovador(Aprovador proximoAprovador) {
		this.proximoAprovador = proximoAprovador;
	}

	@Override
	public void aprovar(Despesa despesa) {
		
		if(despesa.getValor() <= limite) {
			System.out.println("Despesa aprovada pelo Gerente");
			
		}else if(proximoAprovador != null) {
			proximoAprovador.aprovar(despesa);
			
		}else {
			System.out.println("Nenhum aprovador disponível para aprovar a despesa");
		}
	}

}
