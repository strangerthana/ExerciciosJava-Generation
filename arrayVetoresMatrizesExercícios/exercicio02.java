package arrayVetoresMatrizesExerc�cios;

import java.util.Scanner;

public class exercicio02 {
	/*Programa: Exerc�cio 02 - Vetor
	 * Autor: Thnailde Oliveira
	 * Data: 07/06/2021
	 
	  Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	� Os n�meros pares digitados;  
	� A soma dos n�meros pares digitados; 
	� Os n�meros �mpares digitados; 
	� A quantidade de n�meros �mpares digitados.
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
			System.out.println("Valor �mpar: " + vetor[x]);
			vetorImpar[x] = vetor[x];
			somaImpar += vetor[x];
			quantImpar++;
		}
		}
		
		System.out.println("Soma dos n�meros pares: " + somaPar);
		System.out.println("Quantidade de n�meros �mpares digitados: " + quantImpar);
		
			for (int x = 0; x < 6; x++) {
				System.out.println(vetorPar[x]);
			}
			for(int x = 0; x < 6; x++) {
				System.out.println(vetorImpar[x]);
			}
		ler.close();
		
	}
	
	

}
