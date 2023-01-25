import java.util.Locale;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual valor do raio: ");
		double raio = sc.nextDouble();
		
		double pi = 3.14159;
		double quadrado = raio * raio;
		
		double area = quadrado * pi;
		
		
		System.out.printf("A=%.4f%n", area);
		
		
		sc.close();
		
	}

}
