package lacoRepeticaoExercicios;

import java.util.Scanner;

public class Exercicio2For {
	/*Programa: Ler 10 números e imprimir quantos são pares e quantos são ímpares.
	 * Autor: Thanailde Oliveira. 
	 * Data: 04/06/2021
	 * 
		(FOR)
	 */

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, contPar = 0, contImpar = 0;
		
		for(int i = 1; i <= 10; i++) {
		
		System.out.println("Digite o " + i + " número:");
		numero = ler.nextInt();
		
		if(numero % 2 ==0) {
			contPar++;
		}
		
		else {
			contImpar++;
}
		
		}
		System.out.println("\nQuantidade de números pares: " + contPar + "\nQuantidade de números ímpares: " + contImpar);
		
		ler.close();
}
}
