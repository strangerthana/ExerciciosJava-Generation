package lacoRepeticaoExemplos;

import java.util.Scanner;

public class La�oRepeticaoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 0;
		
		while(numero != 10) {
			System.out.println("Digite um n�mero:");
			
			numero = ler.nextInt();
			
			if(numero == 10) {
				System.out.println("Acertou!");
				
			}
			else {
				System.out.println("Errou :(");
			}
			
		}

	}

}
