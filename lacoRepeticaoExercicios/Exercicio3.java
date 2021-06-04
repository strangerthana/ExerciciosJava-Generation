package lacoRepeticaoExercicios;

import java.util.Scanner;

public class Exercicio3 {
	/*Programa: Total de pessoas com menos de 21 anos e mais de 50 anos.
	 * Autor: Thanailde Oliveira. 
	 * Data: 04/06/2021
	  
	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. (WHILE)
	 */

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, totalMenor21 = 0, totalMaior50 = 0;
		
		while(idade != -99) {
		
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		
		if(idade < 21) {
			totalMenor21++;
		
		}
		
		else if(idade > 50) {
			totalMaior50++;
			
		}

	}
		System.out.println("\nTotal de pessoas com menos de 21 anos: " + totalMenor21);
		System.out.println("\nTotatl de pessoas com mais de 50 anos: " + totalMaior50);
		
		ler.close();
}
}
