package arrayVetoresMatrizesExercícios;

import java.util.Scanner;

public class exercicio02 {
	/*Programa: Exercício 02 - Vetor
	 * Autor: Thnailde Oliveira
	 * Data: 07/06/2021
	 
	  Faça um programa que receba 6 números inteiros e mostre: 
	• Os números pares digitados;  
	• A soma dos números pares digitados; 
	• Os números ímpares digitados; 
	• A quantidade de números ímpares digitados.
	*/
	public static void main(String[] args) {
		
		int[] vetor = new int [6];
		
		int  somaPar = 0, quantImpar = 0, somaImpar = 0;
		
		int[] vetorPar = new int[6];
		
		int[] vetorImpar = new int[6];
		
		Scanner ler = new Scanner(System.in);
		
		for(int x = 0; x < 6; x++) {
			System.out.println("Digite um valor: ");
			vetor[x] = ler.nextInt();
		
		
		if(vetor[x] % 2 == 0) {
			vetorPar[x] = vetor[x];
			System.out.println("Valor par: " + vetor[x]);
			
			somaPar += vetor[x];
			
		}
		else {
			System.out.println("Valor Ímpar: " + vetor[x]);
			vetorImpar[x] = vetor[x];
			somaImpar += vetor[x];
			quantImpar++;
		}
		}
		
		System.out.println("Soma dos números pares: " + somaPar);
		System.out.println("Quantidade de números ímpares digitados: " + quantImpar);
		
			for (int x = 0; x < 6; x++) {
				System.out.println(vetorPar[x]);
			}
			for(int x = 0; x < 6; x++) {
				System.out.println(vetorImpar[x]);
			}
		ler.close();
		
	}
	
	

}
