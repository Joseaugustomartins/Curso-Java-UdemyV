package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class ProgramEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Products product = new Products();
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Preco: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		
		System.out.println();
		System.out.print("Digite o número de produtos que você quer adicionar no estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Produtos atualizados: " + product);
		
		System.out.println();
		System.out.println("Digite o número de produtos que você quer retirar no seu estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Produtos atualizados: " + product);
		
		sc.close();
	}

}
