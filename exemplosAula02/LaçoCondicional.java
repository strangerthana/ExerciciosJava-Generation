package exemplosAula02;

import java.util.Scanner;

public class La�oCondicional {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		
		nota1 = ler.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 9.0) {
			
			System.out.println("\nAprovado(a) com m�rito." + "\nM�dia:" + media);
			
		}
		else if(media >= 6.0 && media <9.0) {
			
		}
		else if(media >= 3.0 && media <6.0) {
		System.out.println("\nRecupera��o" + "\nM�dia:" + media);
		}
		
		else {
			
	System.out.println("\nReprovado" + "\nM�dia: " + media);
		}
		
		ler.close();
		
		
		

	}

}
