package ExerciciosSobreMemoria;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, somapares = 0, npares = 0;
		double mediapares;
		
		System.out.print("Quantos elementos vai ter o vetor: ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if(vetor[i] % 2 == 0) {
				somapares = somapares + vetor[i];
				npares++;
			}
		}
		
		if (npares == 0) {
			System.out.println("nenhum numero PAR");
		}
		
		else {
			mediapares = (double) somapares/npares;
			
			System.out.printf("Media dos PARES = %.1f\n", mediapares);
		}
		

		sc.close();
	}

}
