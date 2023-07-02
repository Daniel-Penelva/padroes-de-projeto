package padroesDeProjetos.composite;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements Component{
	
	private String nome;
	private List<Component> componentes;
	
	public Departamento(String nome) {
		this.nome = nome;
		this.componentes = new ArrayList<>();
	}
	
	public void adicionarComponente(Component componente) {
		componentes.add(componente);
	}
	
	public void removerComponente(Component componente) {
		componentes.remove(componente);
	}

	@Override
	public void showDetails() {
		System.out.println("Departamento: " + nome);
		System.out.println("Componentes:");
		
		for (Component component : componentes) {
			component.showDetails();
		}
	}
}
