public abstract class Conta implements IConta {
    // variáveis para controlar a agência e número da agência
    private static final int AGENCIA_CONST = 1;
    private static int NUMERO_CONST = 0;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_CONST;
        this.numero = NUMERO_CONST++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta cFinal) {
        this.sacar(valor);
        cFinal.depositar(valor);
    }

    protected void imprimirDados() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Número: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}
