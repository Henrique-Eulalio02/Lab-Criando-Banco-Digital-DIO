public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Henrique");

        ContaCorrente cc = new ContaCorrente(cliente);
        ContaPoupanca cp = new ContaPoupanca(cliente);

        cc.depositar(10.0);
        cp.depositar(20.0);
        cc.transferir(5.0, cp);
        cp.imprimirExtrato();
        cc.imprimirExtrato();
    }
}
