package arrayVetoresMatrizesExerc�cios;

public class exercicio01 {
	/*Programa: Exerc�cio 01 - Vetor
	 * Autor: Thnailde Oliveira
	 * Data: 07/06/2021
	 
	  Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os
	   seguintes passos: 
	(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
	(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do
	 vetor e mostre na tela esta soma. 
	(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
	(d) Mostre na tela cada valor do vetor A, um em cada linha.
	*/
	
	public static void main(String[] args) {
		
		int[] A = new int[6];
		int soma = 0;
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		soma = soma + A[0] + A[1] + A[5];
		
		System.out.println("A soma dos vetores valores das posi��es A[0], A[1] e A[5] �: " + soma);
		
		A[4] = 100;
		
		System.out.println("\nOs valores do vetor A s�o: \n\nA[0]: " + A[0] + "\nA[1]: " + A[1] + "\nA[2]: " + A[2] + "\nA[3]: " + A[3] + "\nA[4]: " + A[4] + "\nA[5]: " + A[5]);
				
		
		
	}
}
