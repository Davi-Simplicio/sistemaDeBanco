public class Credito extends Conta{
    private int diaFatura;
    private double limite;
    public Credito(int numero, double saldo, int qtdTransacoes, double limite, int diaFatura, double limite1) {
        super(numero, saldo, qtdTransacoes, limite);
        this.diaFatura = diaFatura;
        this.limite = limite1;
    }
}
