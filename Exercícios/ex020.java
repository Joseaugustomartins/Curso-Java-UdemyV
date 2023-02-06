import java.util.Scanner;

public class ex020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de vezes que o teste vai ser realizado: ");
		int n = sc.nextInt();
		
		
		for(int i = 0; i < n; i ++) {
			System.out.println("Digite o valor do primeiro teste:");
			double p1 = sc.nextDouble();
			System.out.println("Digite o valor do segundo teste:");
			double p2 = sc.nextDouble();
			System.out.println("Digite o valor do terceiro teste: ");
			double p3 = sc.nextDouble();
			
			double media = (p1 * 2.0 + p2 * 3.0 + p3 * 5.0) / 10.0;
			
			System.out.println();
			System.out.printf("%.1f%n", media);
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
