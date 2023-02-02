import java.util.Scanner;

public class ex015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		int senha = sc.nextInt();
		
		while(senha != 2000) {
			System.out.println("Senha Invalida! Tente novamente");
			if (senha <= 2000) {
				System.out.println(" Tente um senha maior");
			}
			else{
				System.out.println("Tente uma senha menor");
			}
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		
		
		sc.close();
	}

}
