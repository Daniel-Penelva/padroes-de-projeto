package padroesDeProjetos.abstractFactory;

// Implementação Orc da facção de Monstros
public class OrcMonstro implements Personagem {

	@Override
	public void atacar() {
		System.out.println("Orc Monstro ataca com força bruta!");
	}

}
