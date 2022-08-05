public class contaPoupanca extends Conta{

    public contaPoupanca(cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("+++ Extrato conta poupança ***");
        imprimirDadosComuns();
    }


}

