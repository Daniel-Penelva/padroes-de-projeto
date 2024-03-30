package padroesDeProjetos.observer;

import java.util.ArrayList;
import java.util.List;

public class Sujeito {

	private List<Observador> observadores;
	private int temperatura;

	public Sujeito() {
		observadores = new ArrayList<>();
	}

	public void adicionarObservadores(Observador observador) {
		observadores.add(observador);
	}

	public void removerObservadores(Observador observador) {
		observadores.remove(observador);
	}

	// Sabemos que é uma lista de observadores que precisam ser informados da atualização da temperatura
	public void notificarObservadores() {
		for (Observador observador : observadores) {
			observador.atualizar(temperatura);
		}
	}

	// Atribuir o valor da temperatura e notificar os observadores
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
		notificarObservadores();
	}

}
