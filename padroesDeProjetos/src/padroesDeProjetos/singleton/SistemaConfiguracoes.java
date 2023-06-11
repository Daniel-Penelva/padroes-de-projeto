package padroesDeProjetos.singleton;

public class SistemaConfiguracoes {

	public static void main(String[] args) {
		
		Singleton configuracoes = Singleton.getInstance();
		System.out.println("Configuração Inicial: " + configuracoes.getConfig());
		
		configuracoes.setConfig("Nova Configuração");
		
		Singleton configuracoes2 = Singleton.getInstance();
		System.out.println("Configuração Atualizada: " + configuracoes2.getConfig());

	}

}
