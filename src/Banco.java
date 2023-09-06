import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta>contas = new ArrayList<>();
    private String nome;
    private String endereco;
    private int agencia;
    private double juros;
    private double taxaDeServico;

    public Banco(ArrayList<Conta> contas, String nome, String endereco, int agencia, double juros, double taxaDeServico) {
        this.contas = contas;
        this.nome = nome;
        this.endereco = endereco;
        this.agencia = agencia;
        this.juros = juros;
        this.taxaDeServico = taxaDeServico;
    }
    public static void cadastrarConta(){

    }
}
