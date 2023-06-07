package padroesDeProjetos.abstractFactory;

// Interface para a facção monstros 
public interface FabricaMonstros extends FabricaPersonagem{

	Personagem criarOrcs();
	Personagem criarFeiticeiro();
}
