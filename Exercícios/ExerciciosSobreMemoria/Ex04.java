package ExerciciosSobreMemoria;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, pos;
		double maior;
		
		System.out.print("Quantos numeros você vai digitar: ");
		n = sc.nextInt();
		double vect[] = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		maior = vect[0];
		pos = 0;
		
		for(int i=0; i<n; i++) {
			if (vect[i]> maior) {
				maior = vect[i];
				pos = i;
			}
		}
		
		System.out.printf("Maior valor = %.1f\n", maior);
		System.out.printf("Posição do maior valor = %d\n", pos);
		
		sc.close();
	}

}
