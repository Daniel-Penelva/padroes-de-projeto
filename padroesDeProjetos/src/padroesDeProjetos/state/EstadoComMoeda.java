package padroesDeProjetos.state;

public class EstadoComMoeda implements EstadoMaquina {

	private MaquinaDeVenda maquinaDeVenda;

	public EstadoComMoeda(MaquinaDeVenda maquinaDeVenda) {
		this.maquinaDeVenda = maquinaDeVenda;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Você já inseriu uma moeda");
	}

	@Override
	public void selecionarBebida() {
		System.out.println("Bebida selecionada");
		maquinaDeVenda.setEstado(maquinaDeVenda.getEstadoVendido());
	}

	@Override
	public void dispensar() {
		System.out.println("Por favor, selecione uma bebida primeiro");
	}

}
