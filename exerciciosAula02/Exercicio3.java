package exerciciosAula02;

import java.util.Scanner;

public class Exercicio3 {
	/*Programa: Categoria por idade
	 * Autor: Thanailde Oliveira. 
	 * Data: 03/06/2021
	 
	Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
	10-14 = infantil
 	15-17 = juvenil
 	18-25 = adulto
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		
		if(idade <= 14) {
			System.out.println("Categoria: Infantil.");
		}
		
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria: Juvenil");
		}
		
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria: Adulto");
		}
		
		else {
			System.out.println("A idade não se encaixa nas categorias Infantil/Juvenil/Adulto.");
		}
		
		ler.close();
}
}