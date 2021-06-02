package Exercicios;

import java.util.Scanner;

public class ExerciciosJava1 {
	/*Programa: Idade expressa em dias.
		 * Autor: Thanailde Oliveira
		 * Data: 02/06/2021 
		 
          Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
          dias e mostre-a expressa apenas em dias.
		 */
	
	 	public static void main(String[] args) {
	 		
			Scanner entrada = new Scanner(System.in);
			int anos, meses, dias, idadeEmDias;
			
			System.out.println("Quantos anos você tem?");
			
			anos = entrada.nextInt();
			
			System.out.println("Quantos anos você tem em meses?");
			
			meses = entrada.nextInt();
			
			System.out.println("Quantos anos você tem em dias?");
			
			dias = entrada.nextInt();
			
			idadeEmDias = anos * 365 + meses * 30 + dias;
			
			System.out.println("Idade em dias:" + idadeEmDias);
			
			entrada.close();
			
			
			
			
			
			
			
			
		}
}
