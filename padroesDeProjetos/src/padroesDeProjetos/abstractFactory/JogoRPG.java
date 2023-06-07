package padroesDeProjetos.abstractFactory;

public class JogoRPG {

	public static void main(String[] args) {
		
		// Criando a fábrica de personagens da facção Herois
		FabricaHerois fabricaHerois = new FabricaHeroisImpl();
		
		Personagem guerreiroHeroi = fabricaHerois.criarGuerreiro();
		guerreiroHeroi.atacar();
		
		Personagem magoHeroi = fabricaHerois.criarMago();
		magoHeroi.atacar();
		
		// Criando a fábrica de personagens da facção Monstros
		FabricaMonstros fabricaMonstros = new FabricaMonstrosImpl();
		
		Personagem orcsMonstro = fabricaMonstros.criarOrcs();
		orcsMonstro.atacar();
		
		Personagem feiticeiroMonstro = fabricaMonstros.criarFeiticeiro();
		feiticeiroMonstro.atacar();
	}

}
