package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	/*Programa: Cálculo
	 * Autor: Thanailde Oliveira
	 * Data: 02/06/2021 
	 
      Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
		
		D = R + S / 2 
		     onde 
		R = (A + B)²
		S = (B + C)²
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		int r = 0, s = 0, d;
		
		System.out.println("Escreva o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Escreva o valor de B: ");
		b = ler.nextInt();
		
		System.out.println("Escreva o valor de C: ");
		c = ler.nextInt();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;
		
		System.out.println("O resultado é: " + d);
		
		ler.close();
		
		
		
		
	}
				
}
