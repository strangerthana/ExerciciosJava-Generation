package exemplosAula02;

import java.util.Scanner;

public class LaçoCondicional3 {
	
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
		 System.out.println("Délis");
		break;
		
		default:
			System.out.println("Letra inválida.");
			
			ler.close();
		
	 }
	 
	 
}
}
