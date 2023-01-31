import java.util.Scanner;

public class ex014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual seu salario? R$");
		double salario = sc.nextDouble();
		
		double impos = 0;
		
		if (salario <= 2000.00) {
			impos = 0.0;
		}
		else if (salario > 2000.00 && salario <= 3000.00) {
			impos = (salario - 2000.00) * 0.08;
		}
		else if (salario > 3000.00 && salario <= 4500.00) {
			impos = (salario - 3000.00) * 0.18 + 1000.0 * 0.08;
		}
		else {
			impos = (salario - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000.0
* 0.08;		}
		if (impos == 0) {
			System.out.println("Insento");
		}
		else {
			System.out.printf("RS  %.2f.%n", impos);
		}
		
		
		sc.close();
	}

}
