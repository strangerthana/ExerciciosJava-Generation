package lacoRepeticaoExemplos;

public class LacoRepeticao {

	public static void main(String[] args) throws InterruptedException {
		
		//Enquanto - while
		int numero = 10;
		
		while(numero > 0) {
			System.out.println("\n Contando..." + numero);
			
			numero = numero - 1;
			Thread.sleep(1000);
		}
		
			System.out.println("\nContagem parada...");
			
			
		
		
	}

}
