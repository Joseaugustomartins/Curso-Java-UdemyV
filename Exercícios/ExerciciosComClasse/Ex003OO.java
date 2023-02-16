package ExerciciosComClasse;

import java.util.Locale;
import java.util.Scanner;

import ClasseDosExercicio.clase033;

public class Ex003OO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		clase033 tud;
		tud = new clase033();
		
		System.out.print("Nome: ");
		tud.nome = sc.nextLine();
		System.out.print("Primeia trimestre: ");
		tud.N1 = sc.nextDouble();
		System.out.print("Segundo semestre: ");
		tud.N2 = sc.nextDouble();
		System.out.print("Terceiro trimestre: ");
		tud.N3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Nota final = %.2f%n", tud.notaf());
		
		if (tud.notaf() < 60.0) {
			System.out.println("REPORVADO");
			System.out.printf("Faltam %.2f PONTOS%n", tud.PontosFaltando());
		}
		else {
			System.out.println("APROVADO");
		}
		
		sc.close();
	}

}
