package padroesDeProjetos.abstractFactory;

// Implementação da fábrica de personagens da facção Heróis
public class FabricaHeroisImpl implements FabricaHerois {

	@Override
	public Personagem criarPersonagem() {
		
		// Implementação padrão para criar personagens na facção heróis
		return criarGuerreiro();
	}

	@Override
	public Personagem criarGuerreiro() {
		
		return new GuerreiroHeroi();
	}

	@Override
	public Personagem criarMago() {
		
		return new MagoHeroi();
	}
}
