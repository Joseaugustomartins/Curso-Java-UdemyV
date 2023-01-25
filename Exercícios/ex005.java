import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o código da peça 1: ");
		int p1 = sc.nextInt();
		System.out.println("Qual o número de peças 1: ");
		int n1 = sc.nextInt();
		System.out.println("Qual valor unitário da peça 1: ");
		double valor = sc.nextDouble();
		
		System.out.println("Qual o código da peça 2: ");
		int p2 = sc.nextInt();
		System.out.println("Qual o número de peças 2: ");
		int n2 = sc.nextInt();
		System.out.println("Qual valor unitário da peça 2: ");
		double  valor2 = sc.nextDouble();
		
		
		double vap = (n1 * valor) + (n2 * valor2);
		
		
		System.out.printf("Valor a pagar: R$ %.2f%n", vap);
		
		
		
		
		
		sc.close();
	}

}
