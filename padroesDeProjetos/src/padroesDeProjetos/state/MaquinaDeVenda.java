package padroesDeProjetos.state;

//Classe que representa a máquina de venda automática
public class MaquinaDeVenda {

	private EstadoMaquina estadoSemMoeda;
	private EstadoMaquina estadoComMoeda;
	private EstadoMaquina estadoVendido;
	private EstadoMaquina estadoAtual;

	public MaquinaDeVenda() {
		estadoSemMoeda = new EstadoSemMoeda(this);  // Estou criando uma nova instância do estado EstadoSemMoeda e passando a referência this como argumento para o construtor. O this se refere à instância atual da classe MaquinaDeVenda. Isso significa que estou passando uma referência da própria instância da máquina de venda automática para o estado EstadoSemMoeda.
		estadoComMoeda = new EstadoComMoeda(this);
		estadoVendido = new EstadoVendido(this);
		estadoAtual = estadoSemMoeda;  // Estou definindo o estado inicial da máquina de venda automática como estadoSemMoeda. Isso significa que, quando uma nova instância da máquina de venda automática é criada, ela começa em um estado onde nenhuma moeda foi inserida.
		
		//OBS. o uso do this no construtor MaquinaDeVenda() permite que os estados da máquina de venda automática tenham acesso à instância atual da máquina de venda automática
	}

	public void inserirMoeda() {
		estadoAtual.inserirMoeda();
	}

	public void selecionarBebida() {
		estadoAtual.selecionarBebida();
	}

	public void dispensar() {
		estadoAtual.dispensar();
	}

	// Getters
	public EstadoMaquina getEstadoSemMoeda() {
		return estadoSemMoeda;
	}

	public EstadoMaquina getEstadoComMoeda() {
		return estadoComMoeda;
	}

	public EstadoMaquina getEstadoVendido() {
		return estadoVendido;
	}

	// Atribuindo valores do estado
	public void setEstado(EstadoMaquina estado) {
		this.estadoAtual = estado;
	}
}
