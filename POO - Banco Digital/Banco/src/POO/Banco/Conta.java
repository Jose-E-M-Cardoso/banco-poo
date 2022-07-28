package POO.Banco;

public abstract class Conta implements IConta {
    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    private double saldo;
    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public int getAgencia(double valor) {
        return 0;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }
}
