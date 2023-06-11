package padroesDeProjetos.singleton;

public class Singleton {
	
	private static Singleton instance;
	private String config;
	
	public Singleton() {
		
		// Construtor privado para evitar a criação direta da instâncias
		config = "Configuração Padrão";
	}
	
	public static Singleton getInstance() {
		
		// Se a instância ainda não existe cria uma.
		if(instance == null) {
			instance = new Singleton();
		}
		
		// Retorna a instância se já existe
		return instance;
	}

	// Método setters e getters
	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}
}
