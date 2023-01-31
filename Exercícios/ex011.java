import java.util.Scanner;

public class ex011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o código do produto: ");
		int escolha = sc.nextInt();
		System.out.println("Qual a quantidade? ");
		int quant = sc.nextInt();
		double tot = 0;
		
		if(escolha == 1) {
			tot = quant * 4.00;
		}
		else if(escolha == 2){
			tot = quant * 4.50;
		}
		else if(escolha == 3){
			tot = quant * 5.00;
		}
		else if(escolha == 4){
			tot = quant * 2.00;
		}
		else if(escolha == 5){
			tot = quant * 1.50;
		}
		
		
		System.out.printf("Total: R$%.2f%n", tot);
		
		
		sc.close();
	}

}
