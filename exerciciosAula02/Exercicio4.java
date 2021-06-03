package exerciciosAula02;

import java.util.Scanner;

public class Exercicio4 {
	/*Programa: Par/�mpar
	 * Autor: Thanailde Oliveira. 
	 * Data: 03/06/2021
	 
	Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	�mpar exiba o n�mero elevado ao quadrado.
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero; 
		double raiz, elevado;
		
		System.out.println("Digite um n�mero inteiro: ");
		numero = ler.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("O n�mero � par.");
			
			raiz = Math.sqrt(numero);
			
			System.out.println("A raiz do n�mero �: " + raiz);
		}
		else if(numero %2 == 1) {
			System.out.println("O n�mero � �mpar.");
			
			elevado = Math.pow(numero, 2);
			
			System.out.println("O quadrado do n�mero �: " + elevado);
			
			ler.close();
		}
		
	}
}
