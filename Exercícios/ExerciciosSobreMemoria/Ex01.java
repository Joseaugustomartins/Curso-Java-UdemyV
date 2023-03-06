package ExerciciosSobreMemoria;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.print("Quantos numeros você quer digitar: ");
		n = sc.nextInt();
		int [] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		 
		System.out.println("Numeros NEGATIVOS: ");
		 
		 for (int i=0; i<n; i++) {
			 if(vect[i] < 0) {
				 System.out.printf("%d\n", vect[i]);
			 }
		 }
		 
		 sc.close();
		}

}
