package POO.Banco;

public interface IConta {
    public int getAgencia(double valor);
    public void sacar(double valor);
    public void depositar(double valor);
    public void transferir(Conta contaDestino, double valor);

    public void imprimirExtrato();

}
