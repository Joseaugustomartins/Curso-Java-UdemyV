package application;

import java.util.Scanner;

import entities.Converor;

public class ExFix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual valor atual do dollar: $");
		double dollar = sc.nextDouble();
		System.out.print("Quanto dollares você vai comprar(em reais): R$");
		double reais = sc.nextDouble();
		
		double result = Converor.ValorFi(dollar, reais);
		System.out.printf("Com o juros você terá: %.2f%n", result);
		
		
		
		
		sc.close();
	}

}
