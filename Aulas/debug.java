import java.util.Locale;
import java.util.Scanner;

public class debug {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual a largura? ");
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado =  sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);
		
		sc.close();
	}

}
