package exerciciosAula02;

import java.util.Scanner;

public class Exercicio2 {
	/*Programa: N�meros em ordem crescente.
	 * Autor: Thanailde Oliveira. 
	 * Data: 03/06/2021
	 
	Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Entre com o 1� n�mero: ");
		n1 = ler.nextInt();
		
		System.out.println("Entre com o 2� n�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("Entre com o 3� n�mero: ");
		n3 = ler.nextInt();
		
		if(n1 < n2) {
			
			if(n2 < n3) {
				System.out.println("\nA ordem crescente dos n�meros �: " + n1 + ", " + n2 + ", " + n3);	
			}
			
			else if(n1 < n3) {
				System.out.println("\nA ordem crescente dos n�meros �: " + n1 + ", " + n3 + ", " + n2);
			}
			else {
				System.out.println("\nA ordem crescente dos n�meros �: " + n3 + ", " + n1 + ", " + n2);
			}
		}
		
			else if(n2 < n3) {
				
			if(n1 < n3) {
				System.out.println("\nA ordem crescente dos n�meros �: " + n2 + ", " + n1 + ", " + n3);
			}
			
			else {
				System.out.println("\nA ordem crescente dos n�meros �: " + n2 + ", " + n3 + ", " + n1);
			}
		}
			else {
				System.out.println("\nA ordem crescente dos n�meros �: " + n3 + ", " + n2 + ", " + n1);
			}
		
		
		ler.close();
}
		
	}
