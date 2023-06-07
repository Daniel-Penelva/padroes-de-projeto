package padroesDeProjetos.abstractFactory;

// Interface para a facção heróis
public interface FabricaHerois extends FabricaPersonagem{
	
	Personagem criarGuerreiro();
	Personagem criarMago();
}
