package padroesDeProjetos.prototype;

public class SistemaClonagem {
	
	public static void main(String[] args) {
		
		Celula celulaOriginal = new Celula("Célula Original");
		System.out.println("Tipo de célula original: " + celulaOriginal.getTipo());
		
		
		try {
			Celula celulaClone = celulaOriginal.clone();
			celulaClone.setTipo("Célula Clonada");
			System.out.println("Tipo de célula clonada: " + celulaClone.getTipo());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
