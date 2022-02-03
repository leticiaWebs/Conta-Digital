
public class ContaCorrente  extends Conta{
    
	private static  int SEQUENCIAL = 100;
	private static final int AGENCIA_PADRAO = 1;

	public ContaCorrente() {
    	super.agencia = AGENCIA_PADRAO;
    	super.numero = SEQUENCIAL++;
    }
	
		
		
	}
