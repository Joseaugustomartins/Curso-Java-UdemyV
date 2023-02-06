import java.util.Scanner;

public class ex021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos números você vai ler: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o primeiro valor: ");
			int p1 = sc.nextInt();
			System.out.println("Digite o segundo valor: ");
			int p2 = sc.nextInt();
			if(p2 == 0) {
				System.out.println();
				System.out.println("Divisão impossivel");
				System.out.println();
			}
			else {
				double media =(double) p1 / p2;
				System.out.println();
				System.out.printf("%.1f%n", media);
				System.out.println();
			}
		}
		
		sc.close();
	}

}
