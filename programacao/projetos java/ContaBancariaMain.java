public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000, 1.5, 10);
        cc.depositar(500);
        cc.sacar(200);
        cc.cobrarTarifaMensal();
        cc.sacar(800);

        ContaPoupanca cp = new ContaPoupanca(2000);
        cp.depositar(1000);
        cp.sacar(500);
        cp.sacar(2000);
    }
}
