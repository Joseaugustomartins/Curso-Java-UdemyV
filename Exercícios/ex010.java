import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Que  horas começou? ");
		int hi = sc.nextInt();
		System.out.println("Que horas acabou? ");
		int hf = sc.nextInt();
		
		int duracao;
		if (hi < hf) {
			duracao = hf - hi;
		}
		else {
			duracao = 24 - hi + hf;
		}
		
		System.out.println("O jogo durou " + duracao + " Horas(s)");
		
		
		sc.close();
	}

}
