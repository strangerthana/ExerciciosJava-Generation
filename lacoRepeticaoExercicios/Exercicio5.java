package lacoRepeticaoExercicios;

import java.util.Scanner;

public class Exercicio5 {
	/*Programa: Soma dos números digitados.
	 * Autor: Thanailde Oliveira. 
	 * Data: 04/06/2021
	  
	Crie um programa que leia um número do teclado até que encontre um
	número igual a zero. No final, mostre a soma dos números
	digitados.(DO...WHILE)
	 */

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			
			soma += numero;
			
		} while(numero > 0);
		
		System.out.println("A soma dos números digitados é: " + soma);
		
		ler.close();
	}

}
