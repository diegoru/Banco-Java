public class Main {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNome("Diego");

        Conta cc = new ContaCorrente(diego);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(diego);

        cc.transferir(15, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
