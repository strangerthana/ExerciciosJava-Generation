package lacoRepeticaoExercicios;

public class Exercicio1For {
	
	/*Programa: Números de 1000 a 1999 que quando divididos por 11 temos 5.
	 * Autor: Thanailde Oliveira. 
	 * Data: 04/06/2021
	 * 
		(FOR)
	 */

	public static void main(String[] args) {
		
		for(int i = 1000; i < 2000; i++) {
		
		if(i%11==5) {
		
			System.out.println(i);	
		}
	}
}

}