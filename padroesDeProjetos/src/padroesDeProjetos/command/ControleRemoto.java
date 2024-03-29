package padroesDeProjetos.command;

import java.util.ArrayList;
import java.util.List;

public class ControleRemoto {

	private List<Comando> comandos;
	private int ultimoComando;

	public ControleRemoto() {
		comandos = new ArrayList<>();
		ultimoComando = -1;
	}

	public void setComando(int i, Comando comando) {
		comandos.add(i, comando);
		ultimoComando = i;
	}

	public void executaComando(int i) {
		if (i < 0 || i > comandos.size()) {
			throw new IllegalArgumentException("Comando inválido!");
		}
		comandos.get(i).executar();
	}

	public void desfazerUltimoComando() {
		if (ultimoComando >= 0) {
			comandos.get(ultimoComando).desfazer();
			ultimoComando = -1;
		}
	}

}
