public class Juridica extends Pessoa{
    private String razaoSocial;
    private long cnpj;

    public Juridica(String endereco, String razaoSocial, long cnpj) {
        super(endereco);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Juridica{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj=" + cnpj +
                "} " + super.toString();
    }
}
