package exerciciosAula02;

import java.util.Scanner;

public class Exercicio2 {
	/*Programa: Números em ordem crescente.
	 * Autor: Thanailde Oliveira. 
	 * Data: 03/06/2021
	 
	Faça um programa que entre com três números e coloque em ordem crescente.
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
		
		if(n1 < n2) {
			
			if(n2 < n3) {
				System.out.println("\nA ordem crescente dos números é: " + n1 + ", " + n2 + ", " + n3);	
			}
			
			else if(n1 < n3) {
				System.out.println("\nA ordem crescente dos números é: " + n1 + ", " + n3 + ", " + n2);
			}
			else {
				System.out.println("\nA ordem crescente dos números é: " + n3 + ", " + n1 + ", " + n2);
			}
		}
		
			else if(n2 < n3) {
				
			if(n1 < n3) {
				System.out.println("\nA ordem crescente dos números é: " + n2 + ", " + n1 + ", " + n3);
			}
			
			else {
				System.out.println("\nA ordem crescente dos números é: " + n2 + ", " + n3 + ", " + n1);
			}
		}
			else {
				System.out.println("\nA ordem crescente dos números é: " + n3 + ", " + n2 + ", " + n1);
			}
		
		
		ler.close();
}
		
	}
