package exerciciosAula02;

import java.util.Scanner;

public class Exercicio1 {
	/*Programa: Qual n�mero � o maior. 
	 * Autor: Thanailde Oliveira. 
	 * Data: 03/06/2021
	 
	 Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
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
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("\nO 1� n�mero � o maior.");
		}
		
		else if(n2 > n1 && n2 > n3) {
			System.out.println("\nO 2� n�mero � o maior.");
		}
		else if(n3 > n1 && n3 > n2){
			System.out.println("\nO 3� n�mero � o maior.");
		}
		
		ler.close();

	}

}
