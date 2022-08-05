public class contaCorrente extends Conta{


    public contaCorrente(cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato conta corrente ***");
        imprimirDadosComuns();
    }
}
