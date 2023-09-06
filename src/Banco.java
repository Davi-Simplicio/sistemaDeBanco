import java.util.ArrayList;

public class Banco {
    static Pessoa cliente1  = new Fisica("Rua peixinho doce 4712",123456789,"Gabriel");
    static Pessoa cliente2  = new Juridica("Rua José Carlos 366","IG Energia Renovavel",144105689);
    private ArrayList<Conta>contas;
    private String nome;
    private String endereco;
    private int agencia;
    private double juros;
    private double taxaDeServico;
    private int passarDia;

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public double getTaxaDeServico() {
        return taxaDeServico;
    }

    public int getPassarDia() {
        return passarDia;
    }

    public void setPassarDia(int passarDia) {
        this.passarDia = passarDia;
    }

    public Banco(String nome, String endereco, int agencia, double juros, double taxaDeServico) {
        this.contas = new ArrayList<>();
        this.nome = nome;
        this.endereco = endereco;
        this.agencia = agencia;
        this.juros = juros;
        this.taxaDeServico = taxaDeServico;
    }
    public void cadastrarConta(){
        Conta contaCorrenteDoGabriel = new Corrente(cliente1,2,0,0,"4321");
        this.contas.add(contaCorrenteDoGabriel);
        Conta contaDaIG = new Corrente(cliente2,1,0,0,"1234");
        this.contas.add(contaDaIG);
        Conta contaPoupancaDoGabriel = new Poupanca(cliente1,3,0,0,"321");
        this.contas.add(contaPoupancaDoGabriel);
        Conta contaCreditoDaIG = new Credito(cliente1,4,0,0,0,10000,"123");
        this.contas.add(contaCreditoDaIG);

    }
    public Conta verificaContas(String senha){
        for (Conta contaE:this.contas) {
            if (senha.equals(contaE.getSenha())){
                return contaE;
            }
        }
        return null;
    }
    public Conta numeroDaConta(int opcao){
        for (Conta contaE:this.contas) {
            if (opcao==contaE.getNumero()){
                return contaE;
            }
        }
        return null;
    }
    public void verificaFatura(){
        for (Conta contaE:contas) {
            if (contaE instanceof Credito){
                if (((Credito) contaE).getDiaFatura() < this.passarDia && contaE.saldo()<0){
                    contaE.pagamento(contaE.saldo()*juros);
                    System.out.println("Removido do saldo "+contaE.saldo()*juros );
                }
            }
        }
    }

}
