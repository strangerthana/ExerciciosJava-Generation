package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	/*Programa: C�lculo
	 * Autor: Thanailde Oliveira
	 * Data: 02/06/2021 
	 
      Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
		
		D = R + S / 2 
		     onde 
		R = (A + B)�
		S = (B + C)�
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
		
		System.out.println("O resultado �: " + d);
		
		ler.close();
		
		
		
		
	}
				
}
