package ClasseDosExercicio;

public class clase02 {
	public String nome;
	public double SalarioBruto;
	public double imposto;
	
	
	public double salarioR() {
		return SalarioBruto - imposto;
	}
	
	public void NovoSalario(double porcentagem) {
		SalarioBruto += SalarioBruto * porcentagem / 100.0;
	}
	
	
	
	
	
	public String toString() {
		return nome 
			+ ", R$"
			+ String.format("%.2f%n", salarioR());
		
	}
}
