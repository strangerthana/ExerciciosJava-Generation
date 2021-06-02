package Exercicios;

import java.util.Scanner;

public class ExercicioJava6 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		double d, raiz;
		
		System.out.println("Digite o valor de X no primeiro ponto: ");
		x1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y no primeiro ponto: ");
		y1 = entrada.nextDouble();
		
		System.out.println("Digite o valor de X no segundo ponto: ");
		x2 = entrada.nextDouble();
		
		System.out.println("Digite o valor de Y no segundo ponto: ");
		y2 = entrada.nextDouble();
		
		d = ((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1));
		
		raiz = Math.sqrt(d);
		
		System.out.println("A potência de X e Y é:" + d);
		System.out.println("A raiz de X e Y é: " + raiz);
		
		entrada.close();
		
		
		
		
		
	}

}
