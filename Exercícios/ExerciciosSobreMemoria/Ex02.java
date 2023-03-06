package ExerciciosSobreMemoria;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n, qtdpares;
		
		System.out.print("Quantos numeros você vai digitar: ");
		n = sc.nextInt();
		int vect[] = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("\nNumeros PARES:  ");
		
		qtdpares=0;
		
		for (int i=0; i<n; i++) {
			if(vect[i]% 2 == 0) {
				System.out.printf("%d  ", vect[i]);
				qtdpares++;
			}
		}
		
		System.out.printf("\nQuantidade de PARES = %d\n", qtdpares);
		
		sc.close();
	}

}
