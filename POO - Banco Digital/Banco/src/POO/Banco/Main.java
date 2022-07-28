package POO.Banco;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta pp = new ContaPoupanca();

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}
