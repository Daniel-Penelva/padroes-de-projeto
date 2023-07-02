package padroesDeProjetos.composite;

public class Funcionario implements Component {

	private String nome;
	
    public Funcionario(String nome) {
		this.nome = nome;
	}
	
	@Override
	public void showDetails() {
		System.out.println("Funcionário: " + nome);
	}

}
