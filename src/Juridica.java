public class Juridica extends Pessoa{
    private String razaoSocial;
    private long cnpj;

    public Juridica(String razaoSocial, long cnpj) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
}
