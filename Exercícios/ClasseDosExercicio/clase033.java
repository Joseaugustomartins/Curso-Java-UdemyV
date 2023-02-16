package ClasseDosExercicio;

public class clase033 {
	public String nome;
	public double N1;
	public double N2;
	public double N3;
	
	
	public double notaf () {
		return N1 + N2 + N3;
	}
	public double PontosFaltando() {
		if (notaf()< 60.0) {
			return 60.0 - notaf();
		}
		else {
			return 0.0;
		}
	}
}
