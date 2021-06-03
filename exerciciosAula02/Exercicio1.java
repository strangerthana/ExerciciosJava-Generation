package exerciciosAula02;

import java.util.Scanner;

public class Exercicio1 {
	/*Programa: Qual número é o maior. 
	 * Autor: Thanailde Oliveira. 
	 * Data: 03/06/2021
	 
	 Faça um programa que receba três inteiros e diga qual deles é o maior.
	 */

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Entre com o 1° número: ");
		n1 = ler.nextInt();
		
		System.out.println("Entre com o 2° número: ");
		n2 = ler.nextInt();
		
		System.out.println("Entre com o 3° número: ");
		n3 = ler.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("\nO 1° número é o maior.");
		}
		
		else if(n2 > n1 && n2 > n3) {
			System.out.println("\nO 2° número é o maior.");
		}
		else if(n3 > n1 && n3 > n2){
			System.out.println("\nO 3° número é o maior.");
		}
		
		ler.close();

	}

}
