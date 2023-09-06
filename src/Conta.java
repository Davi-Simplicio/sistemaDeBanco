import java.util.ArrayList;

public class Conta {
    private Pessoa titular;
    private int numero;
    private double saldo;
    private int qtdTransacoes;
    private String senha;

    public Conta(Pessoa titular, int numero, double saldo, int qtdTransacoes, String senha) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.qtdTransacoes = qtdTransacoes;
        this.senha = senha;
    }

    public String pagamento(double valor) {
        if (qtdTransacoes>5){
            this.saldo -= this.saldo*Main.bancoEstatico.getTaxaDeServico();
            qtdTransacoes = 0;
        }
        saldo -= valor;
        qtdTransacoes++;
        return ("Pagamento Efetuado");
    }

    void credito(double valor) {
        if (this instanceof Credito){
            ((Credito) this).setLimite(((Credito) this).getLimite()+valor);
        }else {
            saldo += valor;
        }
        qtdTransacoes++;
    }

    public double saldo() {
        return saldo;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular +
                ", numero=" + numero +
                "\n";
    }

    public String menuInicial() {
        return "[1]Pagamento\n[2]Deposito\n[0]Sair";
    }

    public int getNumero() {
        return numero;
    }

    public Pessoa getTitular() {
        return titular;
    }
}
