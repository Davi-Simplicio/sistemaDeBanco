public class Corrente extends Conta{
    private double limite;

    public Corrente(int numero, double saldo, int qtdTransacoes, double limite, double limite1) {
        super(numero, saldo, qtdTransacoes, limite);
        this.limite = saldo/0.2;
    }
    public String transferencia(Conta destino,double valor){
        if (this.saldo()+limite<valor){
            this.setSaldo(this.saldo()-valor);
            destino.setSaldo(destino.saldo()+valor);
            return "Transferencia efetuada";
        }else{
            return "Você não possui saldo suficiente";
        }
    }
    public void saque(){

    }
}
