
public class Conta implements IConta{
	    protected int agencia; 
	    protected int numero;
	    protected double saldo;
	    protected String nome;
	    protected String CPF; 
	    protected double ValorEmprestimo;
	    protected double CondicaoFinanciamento; 
	    
	    
		public String getCPF() {
			return CPF;
		}

		public void setCPF(String cPF) {
			CPF = cPF;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

	    
	    public int getAgencia() {
			return agencia;
		}
		public int getNumero() {
			return numero;
		}
		public double getSaldo() {
			return saldo;
		}
		public void sacar () {
	    }	
	    public void depositar () {
	    }
	    public void transferir () {
	    }
		@Override
		public void sacar(double valor) {
			saldo -=valor;
			
		}
		@Override
		public void depositar(double valor) {
			saldo +=valor;
			
		}
		@Override
		public void transferir(double valor, Conta contaDestino) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			
		}
		@Override
		public void Imprestimo(double valor) {
			saldo += ValorEmprestimo; 
			
		}
		@Override
		public void financiamento(double valor) {
			saldo += CondicaoFinanciamento; 
			
		}
		protected void imprimirExtrato() {
			System.out.println("****** Extrato Conta Corrente *******");
			System.out.println(String.format("Agencia: %d", this.agencia));
			System.out.println(String.format("Conta: %d", this.numero));
			System.out.println(String.format("saldo: %2f" , this.saldo));
			System.out.println(String.format("CPF" ,this.CPF));
			System.out.println(String.format("Cliente:", this.nome)); 
	}

		

		
}


