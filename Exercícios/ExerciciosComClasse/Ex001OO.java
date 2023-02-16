package ExerciciosComClasse;

import java.util.Scanner;

import ClasseDosExercicio.clase01;

public class Ex001OO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		clase01 ret;              // Dar apenas uma variavel
		ret = new clase01();
		
		System.out.print("Digite a altura: ");
		ret.altura = sc.nextDouble();
		System.out.print("Digite a  lagura: ");
		ret.lado = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", ret.area());
		System.out.printf("PERÍMETRO = %.2f%n", ret.perime());
		System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());
		
		
		sc.close();
	}

}
