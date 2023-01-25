import java.util.Locale;
import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite o valor de A: ");
		double a = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		double b = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		double c = sc.nextDouble();
		
		
		
		double at = (a * c) / 2;
		double acr = (c * c) * 3.14159;
		double trap = (a + b) / 2.0 * c;
		double quadra = b * b;
		double ret = a * b;
		
		
		System.out.printf("Triangulo: %.3f%n", at);
		System.out.printf("Circulo: %.3f%n", acr);
		System.out.printf("Trapezio: %.3f%n", trap);
		System.out.printf("Quadrado: %.3f%n", quadra);
		System.out.printf("Retangulo: %.3f%n", ret);
		
	
		sc.close();
	}

}
