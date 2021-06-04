package lacoRepeticaoExercicios;

import java.util.Scanner;

public class Exercicio4 {
	/*Programa: Saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o.
	 * Autor: Thanailde Oliveira. 
	 * Data: 04/06/2021
	  
	Para tanto, a cada uma das pessoas
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	pessoas, calcule e mostre: (WHILE)
	1- o n�mero de pessoas calmas;
	2- o n�mero de mulheres nervosas;
	3- o n�mero de homens agressivos;
	4- o n�mero de outros calmos;
	5- o n�mero de pessoas nervosas com mais de 40 anos;
	6- o n�mero de pessoas calmas com menos de 18 anos.
	 */
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, sexo, humor, cont = 0;
		int cond1 = 0, cond2 = 0, cond3 = 0, cond4 = 0, cond5 = 0, cond6 = 0;
			
		while(cont < 3) {
		
		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Digite o seu sexo (1= Feminino, 2= Masculino, 3= Outros): ");
		sexo = ler.nextInt();
		
		System.out.println("Digite o seu humor (1= Calmo, 2= Nervoso, 3= Agressivo): ");
		humor = ler.nextInt();
		
		if (humor == 1) {
			cond1++;
		}
		if (sexo == 1 && humor == 2) {
			cond2++;
		}
		if (sexo == 2 && humor == 3) {
			cond3++;
		}
		if (sexo == 3 && humor == 1) {
			cond4++;
		}
		if (idade >= 40 && humor == 2) {
			cond5++;
		}
		if (idade <= 18 && humor == 1) {
			cond6++;
		}
		
		cont++;
		
	}
		System.out.println("\nO n�mero de pessoas calmas �: " + cond1);
		System.out.println("\nO n�mero de mulheres nervosas �: " + cond2);
		System.out.println("\nO n�mero de homens agressivos �: " + cond3);
		System.out.println("\nO n�mero de outros calmos �: " + cond4);
		System.out.println("\nO n�mero de pessoas nervosas com mais de 40 anos �: " + cond5);
		System.out.println("\nO n�mero de pessoas calmas com menos de 18 anos �: " + cond6);
		
		ler.close();
}
}

