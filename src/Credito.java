public class Credito extends Conta{
    private int diaFatura;
    private double limite;

    public Credito(Pessoa titular, int numero, double saldo, int qtdTransacoes, int diaFatura, double limite,String senha) {
        super(titular, numero, saldo, qtdTransacoes,senha);
        this.diaFatura = diaFatura;
        this.limite = limite;
    }

    public int getDiaFatura() {
        return diaFatura;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String pagamento(double valor) {
        this.limite-=valor;
        return "Pagamento Efetuado! Dia da fatura é "+diaFatura;
    }

}
