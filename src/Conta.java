import java.util.ArrayList;

public class Conta{
    private int numero;
    private double saldo;
    private int qtdTransacoes;
    private double limite;
    private ArrayList<Pessoa>titular = new ArrayList<>();

    public Conta(int numero, double saldo, int qtdTransacoes, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.qtdTransacoes = qtdTransacoes;
        this.limite = limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void pagamento(double valor){
        saldo-=valor;
    }

    private  void credito(double valor){
        saldo+=valor;
    }

    public double saldo() {
        return saldo;
    }
}
