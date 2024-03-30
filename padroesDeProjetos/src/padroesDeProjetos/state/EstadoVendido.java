package padroesDeProjetos.state;

public class EstadoVendido implements EstadoMaquina {

	private MaquinaDeVenda maquinaDeVenda;

	public EstadoVendido(MaquinaDeVenda maquinaDeVenda) {
		this.maquinaDeVenda = maquinaDeVenda;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Aguarde, a bebida está sendo dispensada");
	}

	@Override
	public void selecionarBebida() {
		System.out.println("Aguarde, a bebida está sendo dispensada");
	}

	@Override
	public void dispensar() {
		System.out.println("Bebida dispensada");
		maquinaDeVenda.setEstado(maquinaDeVenda.getEstadoSemMoeda());
	}

}
