package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	/*Programa: Tempo de duração de um evento em horas, minutos e segundos.
	 * Autor: Thanailde Oliveira
	 * Data: 02/06/2021 
	 
      Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa
       em segundos e mostre-o expresso em horas, minutos e segundos. 
	 */
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int segundos, minutos, horas;
		
		System.out.println("Escreva quantos segundos durou seu evento: ");
		
		segundos = ler.nextInt();
		
		minutos = segundos / 60;
		
		horas = minutos / 60;
		
		System.out.println("Os minutos de duração do seu evento foi:" + minutos);
		System.out.println("As horas de duração do seu evento foi de:" + horas);
		
		ler.close();
		
	}

}
