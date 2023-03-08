package ExerciciosSobreMemoria;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos elementos vai ter o vetor: ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		soma = 0;
		for(int i=0; i<n; i++) {
			soma = soma +vetor[i];
		}
		
		media = soma / n;
		
		System.out.printf("\nMedia do vetor = %.3f\n", media);
		System.out.printf("Elementos abaixo da media:");
		
		for (int i=0; i<n; i++) {
			if(vetor[i] < media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}
	
		sc.close();
	}

}
