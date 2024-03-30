package padroesDeProjetos.memento;

import java.util.Stack;

public class Historico {
	
	private Stack<Memento> historico;
	
	public Historico() {
		historico = new Stack<>();
	}
	
	public void salvarEstado(Documento documento) {
		Memento memento = documento.salvar();
		historico.push(memento);  // Adiciona um item ao topo da pilha.
	}
	
	public void desfazer(Documento documento) {
		if(!historico.isEmpty()) {
			Memento memento = historico.pop();  // Remove e retorna o item que está no topo da pilha.
			documento.restaurar(memento);
		}
		
	}
}
