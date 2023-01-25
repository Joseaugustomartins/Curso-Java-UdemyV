import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int a = sc.nextInt();
		System.out.println("Digite O valor de B: ");
		int b = sc.nextInt();
		System.out.println("Digite o valor de C: ");
		int c = sc.nextInt();
		System.out.println("Diggite o valor de D: ");
		int d = sc.nextInt();
		
		int soma = a * b - c * d;
		
		System.out.println("Diferenca = " + soma);
		
		
		sc.close();
	}

}
