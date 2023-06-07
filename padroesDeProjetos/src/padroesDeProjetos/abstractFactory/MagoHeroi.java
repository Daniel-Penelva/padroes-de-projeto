package padroesDeProjetos.abstractFactory;

//Implementação do Mago da facção Heróis
public class MagoHeroi implements Personagem{

	@Override
	public void atacar() {
		System.out.println("Mago herói atacando!");
	}
}
