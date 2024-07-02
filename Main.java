public class Main {
    public static void main(String[] args) {

        Cliente vitor = new Cliente();
        vitor.setNome("Vitor");

        IConta cc = new ContaCorrente(vitor);
        
        cc.depositar(100.00);
        
        IConta poupanca = new ContaPoupanca(vitor);

        // Transferir 50.00 da conta corrente para a conta poupança
        cc.transferir(50.00, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}