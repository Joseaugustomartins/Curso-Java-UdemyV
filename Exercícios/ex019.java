import java.util.Scanner;

public class ex019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de vezes: : ");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um valor: ");
			int x = sc.nextInt();
			if(x >= 10 && x <= 20 ) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " in");
		
		sc.close();
	}

}
