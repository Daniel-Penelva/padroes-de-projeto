package padroesDeProjetos.abstractFactory;

// Implementação da fábrica de personagens da facção Monstros
public class FabricaMonstrosImpl implements FabricaMonstros {

	@Override
	public Personagem criarPersonagem() {
	// Implementação padrão para criar personagens na facção Monstros
		return criarOrcs();
	}

	@Override
	public Personagem criarOrcs() {
		return new OrcMonstro();
	}

	@Override
	public Personagem criarFeiticeiro() {
		return new FeiticeiroMonstro();
	}

	

}
