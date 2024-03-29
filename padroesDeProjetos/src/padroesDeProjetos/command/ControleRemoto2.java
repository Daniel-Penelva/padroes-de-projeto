package padroesDeProjetos.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControleRemoto2 {

    private Map<Integer, Comando> comandos;
    private List<Comando> historico;

    public ControleRemoto2() {
        comandos = new HashMap<>();
        historico = new ArrayList<>();
    }

    public void setComando(int i, Comando comando) {
        comandos.put(i, comando);
    }

    public void executaComando(int i) {
        Comando comando = comandos.get(i);
        if (comando != null) {
            comando.executar();
            historico.add(comando); // Adicionando o comando ao histórico
        } else {
            System.out.println("Comando não encontrado para o botão " + i);
        }
    }

    public void desfazerUltimoComando() {
        if (!historico.isEmpty()) {
            Comando ultimoComando = historico.remove(historico.size() - 1); // Remove o último comando do histórico
            ultimoComando.desfazer(); // Desfaz o último comando
        } else {
            System.out.println("Não há comandos para desfazer.");
        }
    }
}