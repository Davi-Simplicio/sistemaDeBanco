public class Poupanca extends Conta{
    public Poupanca(Pessoa titular, int numero, double saldo, int qtdTransacoes,String senha) {
        super(titular, numero, saldo, qtdTransacoes,senha);
    }

    public static void saque(){

    }

    @Override
    public String menuInicial() {
        return "[1]Pagamento\n[2]Deposito\n[3]Saque\n[0]Sair";
    }
}
