package padroesDeProjetos.command;

public class Cliente {

	public static void main(String[] args) {
		
		TV tv = new TV();
		
		Comando ligarTV = new LigarTV(tv);
		Comando desligarTV = new DesligarTV(tv);
		Comando aumentarVolume = new AumentarVolume(tv);
		Comando diminuirVolume = new DiminuirVolume(tv);
		
		ControleRemoto controleRemoto = new ControleRemoto();
		controleRemoto.setComando(0, ligarTV);
		controleRemoto.setComando(1, desligarTV);
		controleRemoto.setComando(2, aumentarVolume);
		controleRemoto.setComando(3, diminuirVolume);
		
		controleRemoto.executaComando(0);
		controleRemoto.executaComando(2);
		controleRemoto.executaComando(3);
		controleRemoto.desfazerUltimoComando();
		
		System.out.println("\n");
		
		
		// Exemplo do ControleRemoto2
		System.out.println("Exemplo Controle Remoto 2" + "\n");
		
		ControleRemoto2 controleRemoto2 = new ControleRemoto2();
		controleRemoto2.setComando(0, ligarTV);
		controleRemoto2.setComando(1, desligarTV);
		controleRemoto2.setComando(2, aumentarVolume);
		controleRemoto2.setComando(3, diminuirVolume);
		
		controleRemoto2.executaComando(0);
		controleRemoto2.executaComando(2);
		controleRemoto2.executaComando(3);
		controleRemoto2.desfazerUltimoComando();
		
	}

}
