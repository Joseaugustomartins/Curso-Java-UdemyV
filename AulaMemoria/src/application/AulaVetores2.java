package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class AulaVetores2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos produtos você quer digitar: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite o nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Qual valor: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum/vect.length;
		
		System.out.printf("Media de preço = %.2f%n", avg);
		
		sc.close();
	}

}
