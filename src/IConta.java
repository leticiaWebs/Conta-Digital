
public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void Imprestimo(double valor);
    void financiamento(double valor); 
}
