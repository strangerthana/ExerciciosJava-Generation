package exerciciosPoo;

import java.util.Scanner;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ProdutoEletronico produto1 = new ProdutoEletronico();
		
		System.out.println("Digite o código do primeiro produto: ");
		produto1.setProduto(scan.nextLine());
		
		produto1.setMarca("Iphone");
		produto1.setNome("Iphone 12 Pro");
		produto1.setQuantGB("64");
		produto1.setQuantCameras("3");
		
		produto1.Informacao();
		
		ProdutoEletronico produto2 = new ProdutoEletronico();
		
		System.out.println("\nDigite o código do segundo produto: ");
		produto2.setProduto(scan.nextLine());
		
		produto2.setMarca("Samsung");
		produto2.setNome("Galaxy S20 SE");
		produto2.setQuantGB("128");
		produto2.setQuantCameras("3");
		
		produto2.Informacao();
		
		
		scan.close();
		

	}

}
