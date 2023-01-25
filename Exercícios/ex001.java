import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o Primeiro número: ");
		int primeiro = sc.nextInt();
		System.out.println("Digite o Segundo número: ");
		int segundo = sc.nextInt();
		
		
		int soma = primeiro + segundo;
		
		
		System.out.println("Soma = " + soma);
		
		
		
		sc.close();
	}

}
