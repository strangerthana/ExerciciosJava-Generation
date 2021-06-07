package arrayVetoresMatrizesExercícios;

import java.util.Scanner;

public class exercicio03 {
	
	/*Programa: Exercício 03 - Matriz
	 * Autor: Thnailde Oliveira
	 * Data: 07/06/2021
	 
	 Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
	*/

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int valores = 0;
		
		for(int l = 0; l < matriz.length; l++) {
			
			for(int c = 0; c < matriz[l].length; c++) {
				
				System.out.printf("Digite os valores da matriz: [%d] [%d]", l,c);
				matriz[l][c] = ler.nextInt();
				
				if(matriz[l][c] > 10) {
					valores++;
				}
				
				}
				
			}
		System.out.println("Você digitou " + valores + " valores acima de 10");
		
		ler.close();
	}
		
}
