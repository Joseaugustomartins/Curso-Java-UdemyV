import java.util.Scanner;

public class ex017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ----- POSTO UBAI -----");
		System.out.println();
		System.out.println("Escolha uma das opções: ");
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Finalizar");
		System.out.println();
		
		int alcool = 0;
		int gasolina =  0;
		int diesel = 0;
		
		int escolha = sc.nextInt();
		
		while (escolha != 4) {
			if(escolha == 1) {
				alcool += 1;
			}
			else if(escolha == 2) {
				gasolina += 1;
			}
			else if(escolha == 3) {
				diesel += 1;
			}
			else if(escolha > 4) {
				System.out.println("Número INVALIDO! Tente novamente");
			}
			System.out.println("Escolha outra opção: ");
			escolha = sc.nextInt();
			
		}
		
		System.out.println();
		System.out.println("Muito obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
