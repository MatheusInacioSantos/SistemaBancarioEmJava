public class main {

    public static void main(String[] args) {

        cliente nomeCliente = new cliente();

        nomeCliente.setNome("Matheus Inácio");

        Conta cc = new contaCorrente(nomeCliente);
        cc.depositar(100);
        Conta poup = new contaCorrente(nomeCliente);

        cc.transferir(100, poup);
        cc.imprimirDadosComuns();
        poup.imprimirDadosComuns();
    }
}
