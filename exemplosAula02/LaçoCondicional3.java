package exemplosAula02;

import java.util.Scanner;

public class La�oCondicional3 {
	
 public static void main(String[] args) {
	
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.println("Digite uma letra entre a e d: ");
	 String letra = ler.nextLine();
	 
	 switch(letra) {
	 
	 case "a":
		 System.out.println("Ana");
		break;
		
	 case "b":
		 System.out.println("Bruna");
		break;
		
	 case "c":
		 System.out.println("Caruso");
		break;
		
	 case "d":
		 System.out.println("D�lis");
		break;
		
		default:
			System.out.println("Letra inv�lida.");
			
			ler.close();
		
	 }
	 
	 
}
}
