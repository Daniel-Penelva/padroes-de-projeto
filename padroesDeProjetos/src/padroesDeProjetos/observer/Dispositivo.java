package padroesDeProjetos.observer;

public class Dispositivo implements Observador {

	private String nome;

	public Dispositivo(String nome) {
		this.nome = nome;
	}

	@Override
	public void atualizar(int temperatura) {
		System.out.println(nome + ": A temperatura é: " + temperatura);
	}

}
