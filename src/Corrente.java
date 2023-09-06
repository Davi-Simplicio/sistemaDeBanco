public class Corrente extends Conta{
    private double limite;

    public Corrente(Pessoa titular, int numero, double saldo, int qtdTransacoes,String senha) {
        super(titular, numero, saldo, qtdTransacoes,senha);
    }

    public String transferencia(Conta destinatario,double valor){
        limite = this.saldo()*0.2;
        if (this.saldo()+limite>=valor) {
            this.pagamento(valor);
            destinatario.credito(valor);
            return "Transferencia efetuada";
        }else{
            return "Você não possui saldo suficiente";
        }
    }
    public void saque(){

    }
    @Override
    public String menuInicial() {
        return "[1]Pagamento\n" + "[2]Deposito\n" + "[3]Saque\n[4]Tranferencia\n[0]Sair";
    }
}
