package lacoRepeticaoExemplos;

import java.util.Scanner;

public class LaçoRepeticaoWhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 0;
		
		while(numero != 10) {
			System.out.println("Digite um número:");
			
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
