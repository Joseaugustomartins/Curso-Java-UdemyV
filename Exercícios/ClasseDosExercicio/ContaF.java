package ClasseDosExercicio;

public class ContaF {

		private int conta;
		private String suporte;
		private double  saldo;
		
		
		public ContaF(int conta, String suporte) {
			super();
			this.conta = conta;
			this.suporte = suporte;
		}


		public ContaF(int conta, String suporte, double InicialDeposito) {
			super();
			this.conta = conta;
			this.suporte = suporte;
			deposito(InicialDeposito);
		}


		public int getConta() {
			return conta;
		}


		public String getSuporte() {
			return suporte;
		}


		public void setSuporte(String suporte) {
			this.suporte = suporte;
		}


		public double getSaldo() {
			return saldo;
		}

		public void deposito(double quantia) {
			saldo += quantia;
		}

		public void retirar(double quantia) {
			saldo -= quantia + 5.0;
		}
		
		public String toString() {
			return "Conta "
					+ conta
					+ ", Nome: "
					+ suporte
					+ ", Saldo: R$ "
					+ String.format("%.2f", saldo);
		}
		
		
}
