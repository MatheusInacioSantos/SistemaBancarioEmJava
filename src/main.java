public class main {

    public static void main(String[] args) {

        Cliente nomeCliente = new Cliente();

        nomeCliente.setNome("Matheus");

        Conta cc = new contaCorrente(nomeCliente);
        cc.depositar(100);
        Conta poup = new contaPoupanca(nomeCliente);

        cc.transferir(100, poup);
        cc.imprimirExtrato();
        poup.imprimirExtrato();
    }
}
