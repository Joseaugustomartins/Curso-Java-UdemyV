package ExerciciosComClasse;

import java.util.Scanner;

import ClasseDosExercicio.ContaF;

public class Ex04OO {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ContaF contaF;
		
		System.out.print("Digite o número da conta: ");
		int conta = sc.nextInt();
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		String suporte = sc.nextLine();
		System.out.print("Você depositou um valor inicial (S/N)? ");
		char resp = sc.next().charAt(0);
		
		if (resp == 's') {
			System.out.print("Digite o valor do primeiro deposito: ");
			double InicialDeposito = sc.nextDouble();
			contaF = new ContaF(conta, suporte, InicialDeposito);
		}
		else {
			contaF = new ContaF(conta, suporte);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(contaF);
		
		System.out.println();
		System.out.print("Digite o valor do depósito: ");
		double ValorDepositado = sc.nextDouble();
		contaF.deposito(ValorDepositado);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(contaF);
		
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		double ValorSaque = sc.nextDouble();
		contaF.retirar(ValorSaque);
		System.out.println("Dados da conta atualizado: ");
		System.out.println(contaF);
		
		sc.close();
	}

}
