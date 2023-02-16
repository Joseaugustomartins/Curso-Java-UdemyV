package ClasseDosExercicio;

public class clase01 {
	public double lado;
	public double altura;
	
	public double area() {
		return lado * altura;
	}
	public double perime() {
		return 2 * (lado + altura);
	}
	public double diagonal() {
		return Math.sqrt((altura * altura) + (lado * lado)); 
	}
}
