package Exercicios;

import java.util.Scanner;

public class Exercicio7 {
	/*Programa: Cálculo euquação linear
	 * Autor: Thanailde Oliveira
	 * Data: 02/06/2021 
	 
      Um sistema de equações lineares do tipo:
	  ax + by = c
	  dx + ey = f, pode ser resolvido segundo mostrado abaixo:
	  x= ce - bf/ ae - bd
      y= af - cd/ ae - bd
      
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = entrada.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = entrada.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		e = entrada.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = entrada.nextDouble();
		
		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.println("O valor de y é: " + x);
		System.out.println("O valor de y é: " + y);
		
		entrada.close();
		
		
		
		
		
		
		
	}

}
