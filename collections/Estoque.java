package generation.exercicio.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String produto1 = "Samrtphone Samsung Galaxy S20";
		String produto2 = "Smartphone Redmi Note 10";
		String produto3 = "Smartphone Iphone 12 Apple";
		String produto4 = "Smartphone Samsung Galaxy A72";
		String novoProduto;
		
		System.out.println("=======Lista de produtos no estoque========\n" );
		
		ArrayList<String> produtos = new ArrayList<>();
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		produtos.remove(3);
		
		System.out.println("Deseja adicionar algum produto ao estoque?");
		novoProduto = scan.next();
		
		produtos.add(novoProduto);
		
		for(int i = 0; i <produtos.size(); i++) {
			
			System.out.println((i+1) + "° " + "produto: " +  produtos.get(i));
		
			
			
		}
		
		scan.close();
	}

}
