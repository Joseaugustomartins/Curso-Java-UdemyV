package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class ProgramEST02 {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o valor do raio: ");
		double radius = sc.nextDouble();
		Calculator calc = new Calculator();
		
		double c =calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI %.2f%n", calc.PI);
		
		
		sc.close();
	}
}
