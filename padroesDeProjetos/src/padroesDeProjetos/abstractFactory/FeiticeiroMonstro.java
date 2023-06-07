package padroesDeProjetos.abstractFactory;

//Implementação Feiticeiro da facção de Monstros
public class FeiticeiroMonstro implements Personagem {

	@Override
	public void atacar() {
		System.out.println("Feiticeiro Monstro lançando magías!");
	}

}
