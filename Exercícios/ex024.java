import java.util.Scanner;

public class ex024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de repetições: ");
		int n = sc.nextInt();
		
		
		for (int i=1; i<= n; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
			
		}
		
		sc.close();
	}

}
