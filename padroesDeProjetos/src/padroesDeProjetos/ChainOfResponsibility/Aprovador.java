package padroesDeProjetos.ChainOfResponsibility;

public interface Aprovador {
	
	void setProximoAprovador(Aprovador proximoAprovador);
	void aprovar(Despesa despesa);
}
