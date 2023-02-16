package ExerciciosComClasse;

import java.util.Scanner;

import ClasseDosExercicio.clase02;

public class Ex002oo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		clase02 tud;
		tud = new clase02();
		
		System.out.print("Nome: ");
		tud.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		tud.SalarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		tud.imposto = sc.nextDouble();
		System.out.println();
		
		System.out.println(tud);
		
		System.out.print("Qual percentual aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		tud.NovoSalario(porcentagem);
		
		
		System.out.println();
		System.out.println("Novo salário: " + tud);
		
		
		
		
		sc.close();
	}

}
