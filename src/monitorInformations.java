
public class monitorInformations {
	
	public static void maind(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		cc.imprimirExtrato(); 
		poupanca.imprimirExtrato();
		
	}

}
