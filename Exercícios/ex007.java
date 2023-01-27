import java.util.Scanner;

public class ex007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("Número positivo!");
		}
		else {
			System.out.println("Número  negativo!");
		}	
		sc.close();
	}

}
