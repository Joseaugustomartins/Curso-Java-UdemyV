import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Número de acesso: ");
		int num = sc.nextInt();
		System.out.println("Quantidade de horas trabalhadas: ");
		double h = sc.nextDouble();
		System.out.println("Qual valor recebido por hora: ");
		double va = sc.nextDouble();
		
		
		double salario = va * h;
		
		
		System.out.println();
		System.out.println("Número de acesso: " + num);
		System.out.printf("Salário =  R$ %.2f%n", salario);
		
		
		
		sc.close();
	}

}
