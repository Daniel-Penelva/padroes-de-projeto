package padroesDeProjetos.state;

public class EstadoSemMoeda implements EstadoMaquina {

	private MaquinaDeVenda maquinaDeVenda;

	// 
	public EstadoSemMoeda(MaquinaDeVenda maquinaDeVenda) {
		this.maquinaDeVenda = maquinaDeVenda;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Moeda inserida");
		maquinaDeVenda.setEstado(maquinaDeVenda.getEstadoComMoeda());
	}

	@Override
	public void selecionarBebida() {
		System.out.println("Por favor, insira uma moeda primeiro");
	}

	@Override
	public void dispensar() {
		System.out.println("Por favor, insira uma moeda primeiro");
	}

}
