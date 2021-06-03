package exerciciosAula02;

import java.util.Scanner;

public class Exercicio4 {
	/*Programa: Par/Ímpar
	 * Autor: Thanailde Oliveira. 
	 * Data: 03/06/2021
	 
	Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	ímpar exiba o número elevado ao quadrado.
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero; 
		double raiz, elevado;
		
		System.out.println("Digite um número inteiro: ");
		numero = ler.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("O número é par.");
			
			raiz = Math.sqrt(numero);
			
			System.out.println("A raiz do número é: " + raiz);
		}
		else if(numero %2 == 1) {
			System.out.println("O número é ímpar.");
			
			elevado = Math.pow(numero, 2);
			
			System.out.println("O quadrado do número é: " + elevado);
			
			ler.close();
		}
		
	}
}
