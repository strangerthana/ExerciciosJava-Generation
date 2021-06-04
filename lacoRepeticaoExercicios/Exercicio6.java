package lacoRepeticaoExercicios;

import java.util.Scanner;

public class Exercicio6 {
	/*Programa: Média dos números múltiplos de 3.
	 * Autor: Thanailde Oliveira. 
	 * Data: 04/06/2021.
	  
	Escrever um programa que receba vários números inteiros no teclado. E no
	final imprimir a média dos números múltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, soma = 0, cont = 0;
		double media = 0.0;
		
		do {
			System.out.println("Digite um número: ");
			
			numero = ler.nextInt();
			
			if(numero % 3 == 0) {
				soma += numero;
				cont++;
			}
			
		} while(numero != 0);
		  media = soma / cont;
		  
		  System.out.println("A média dos números múltiplos de 3 é: " + media);
		  
		  ler.close();
		}
	}