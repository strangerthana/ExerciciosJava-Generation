package lacoRepeticaoExercicios;

import java.util.Scanner;

public class Exercicio2For {
	/*Programa: Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
	 * Autor: Thanailde Oliveira. 
	 * Data: 04/06/2021
	 * 
		(FOR)
	 */

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, contPar = 0, contImpar = 0;
		
		for(int i = 1; i <= 10; i++) {
		
		System.out.println("Digite o " + i + " n�mero:");
		numero = ler.nextInt();
		
		if(numero % 2 ==0) {
			contPar++;
		}
		
		else {
			contImpar++;
}
		
		}
		System.out.println("\nQuantidade de n�meros pares: " + contPar + "\nQuantidade de n�meros �mpares: " + contImpar);
		
		ler.close();
}
}
