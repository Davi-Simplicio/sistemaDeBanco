public class Fisica extends Pessoa{
    private long cpf;
    private String nomeCompleto;

    public Fisica(String endereco, long cpf, String nomeCompleto) {
        super(endereco);
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
    }

    @Override
    public String toString() {
        return "Fisica{" +
                "cpf=" + cpf +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                "} " + super.toString();
    }
}
