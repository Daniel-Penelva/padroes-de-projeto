package padroesDeProjetos.composite;

public class Empresa {

	public static void main(String[] args) {
		
		Component departamentoRH = new Departamento("Recursos Humanos");
		Component departamentoTI = new Departamento("Tecnologia da Informação");
		
		Component funcionario1 = new Funcionario("João");
		Component funcionario2 = new Funcionario("Maria");
		
		// Adicionar no departamento o funcionário
		((Departamento) departamentoRH).adicionarComponente(funcionario1);
		((Departamento) departamentoTI).adicionarComponente(funcionario2);
		
		Component empresa = new Departamento("Empresa");
		
		// Adicionar na empresa os departamentos
		((Departamento) empresa).adicionarComponente(departamentoRH);
		((Departamento) empresa).adicionarComponente(departamentoTI);
		empresa.showDetails();
	}
}
