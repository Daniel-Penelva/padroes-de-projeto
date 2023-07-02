package padroesDeProjetos.decorator;

public class ArCondicionado implements Carro {

    private Carro carro;
    
    ArCondicionado(Carro carro){
    	this.carro = carro;
    }
	
	@Override
	public void montar() {
		carro.montar();
		System.out.println("Adicionando ar-condicionado.");
	}
}
