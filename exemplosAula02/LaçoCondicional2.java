package exemplosAula02;

import java.util.Scanner;

public class La�oCondicional2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		 double  n1, n2, resultado = 0;
		char operacao;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = ler.nextDouble();
		
		System.out.println("Digite a opera��o: ");
		operacao = ler.next().charAt(0);
		
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = ler.nextDouble();
		
		if(operacao == '+') {
			
			resultado = n1 + n2;
		}
		
		else if(operacao == '-') {
		
		resultado = n1 - n2;
		
	}
		else if(operacao == '*') {
			
			resultado = n1 * n2;
		}
		else if(operacao == '/') {
			
			resultado = n1 / n2;
			
		}
		
		System.out.println("Resultado: " + resultado);
		
		ler.close();
}
}