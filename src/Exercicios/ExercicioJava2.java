package Exercicios;

import java.util.Scanner;

public class ExercicioJava2 {
	/*Programa: Cálculo da idade em anos, meses e dias.
	 * Autor: Thanailde Oliveira
	 * Data: 02/06/2021 
	 
     Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int anos, meses, dias;
		
		System.out.println("Escreva a quantidade de dias que você viveu: ");
		
		dias = entrada.nextInt();
		
		anos = dias / 365;
		
		meses = dias / 30;
		
		System.out.println("A quantidade de anos que você já viveu é: " + anos);
		
		System.out.println("A quantidade de meses que você já viveu é:" + meses);
		
		entrada.close();
	}
	
	
	
}
