package Exercicios;

import java.util.Scanner;

public class ExercicioJava5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n1, n2, n3, p1, p2, p3, media;
		
		System.out.println("Programa: Média Ponderada.");
		System.out.println("Insira a primeira nota: ");
		
		n1 = entrada.nextDouble();
		
		System.out.println("Insira o peso da primeira nota: ");
		
		p1 = entrada.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		
		n2 = entrada.nextDouble();
		
		System.out.println("Insira o peso da segunda nota: ");
		
		p2 = entrada.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		
		n3 = entrada.nextDouble();
		
		System.out.println("Insira o peso da terceira nota: ");
		
		p3 = entrada.nextDouble();
		
		media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);
		
		System.out.println("A média final do aluno é" + media);
		
		entrada.close();
		
		
	}

}
