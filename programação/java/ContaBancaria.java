class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}

class ContaCorrente extends ContaBancaria {
    private double taxaSaque;
    private double tarifaMensal;

    public ContaCorrente(double saldoInicial, double taxaSaque, double tarifaMensal) {
        super(saldoInicial);
        this.taxaSaque = taxaSaque;
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + taxaSaque;
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.println("Saque de " + valor + " realizado com taxa de " + taxaSaque + ". Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + " com taxa de " + taxaSaque);
        }
    }
}

class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
    }
}
