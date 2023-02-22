package entities;

public class Converor {
	public static double IOF = 0.06;
	
	public static double ValorFi(double dollar, double reais) {
		return dollar * reais * (1.0 + IOF);
 }
}
