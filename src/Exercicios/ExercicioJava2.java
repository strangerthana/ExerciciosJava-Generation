package Exercicios;

import java.util.Scanner;

public class ExercicioJava2 {
	/*Programa: C�lculo da idade em anos, meses e dias.
	 * Autor: Thanailde Oliveira
	 * Data: 02/06/2021 
	 
     Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int anos, meses, dias;
		
		System.out.println("Escreva a quantidade de dias que voc� viveu: ");
		
		dias = entrada.nextInt();
		
		anos = dias / 365;
		
		meses = dias / 30;
		
		System.out.println("A quantidade de anos que voc� j� viveu �: " + anos);
		
		System.out.println("A quantidade de meses que voc� j� viveu �:" + meses);
		
		entrada.close();
	}
	
	
	
}
