package padroesDeProjetos.ChainOfResponsibility;

public class Cliente {
	
	public static void main(String[] args) {
		
		Aprovador funcionarioAprovador = new FuncionarioAprovador(100);
		Aprovador gerenteAprovador = new GerenteAprovador(500); 
		Aprovador diretorAprovador = new DiretorAprovador(1000);
		
		funcionarioAprovador.setProximoAprovador(gerenteAprovador); //funcionarioAprovador = 100 | gerenteAprovador = 500
		gerenteAprovador.setProximoAprovador(diretorAprovador); // gerenteAprovador = 500 | diretorAprovador = 1000
		
		Despesa despesa1 = new Despesa(200);
		Despesa despesa2 = new Despesa(600);
		Despesa despesa3 = new Despesa(1500);
		
		funcionarioAprovador.aprovar(despesa1); // funcionarioAprovador = 100 | despesa = 200
		funcionarioAprovador.aprovar(despesa2); // funcionarioAprovador = 100 | despesa = 600
		funcionarioAprovador.aprovar(despesa3); // funcionarioAprovador = 100 | despesa = 1500
		
	}
}
