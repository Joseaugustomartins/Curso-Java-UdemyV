 package ExerciciosSobreMemoria;

import java.util.Scanner;

import ClasseExMemoria.rent;

public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		rent[] vect = new rent[10];
		
		System.out.print("Quantos quartos serão alugados: ");
		int n = sc.nextInt();
		
		for(int i=1; i<= n; i++) {
			System.out.println();
			System.out.println("alugel: #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int roomNumber = sc.nextInt();
			
			rent rent =new rent(name, email);
			
			vect[roomNumber] = rent;
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for(int i =0; i <10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		
		
		sc.close();
	}

}
