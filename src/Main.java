import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Banco bancoEstatico = new Banco("Banco Estático", "Rua esmeraldino 89", 1, 0.002, 0.02);
    static Conta contaLogada;

    public static void main(String[] args) {
        bancoEstatico.cadastrarConta();
        menu();
    }

    public static void cadastro() {
        login();
    }

    private static void login() {
        System.out.println("Digite sua senha");
        String senha = sc.next();
        if (bancoEstatico.verificaContas(senha) != null) {
            contaLogada = bancoEstatico.verificaContas(senha);
            menuInicial();
        }
    }

    public static void menu() {
        int opcao;
        do {
            System.out.println("[1]Login\n[2]Cadastro\n[3]Sair");
            opcao = sc.nextInt();
            switchCaseMenu(opcao);
        } while (opcao != 3);

    }

    public static void switchCaseMenu(int opcao) {
        switch (opcao) {
            case 1:
                login();
                break;
            case 2:
                cadastro();
                break;
            case 3:
                System.exit(0);
        }
    }

    public static void menuInicial() {
        int opcao;
        do {
            int dia = bancoEstatico.getPassarDia();
            if (contaLogada instanceof Credito){
                System.out.println("Dia Atual: "+dia+"/"+"\n"+"Limite da conta: "+((Credito)contaLogada).getLimite());
            }else {
                System.out.println("Dia Atual: "+dia+"/"+"\n"+"Saldo da conta: "+contaLogada.saldo());

            }
            System.out.println(contaLogada.menuInicial());
            opcao = sc.nextInt();
            switchCaseMenuInicial(opcao);
            bancoEstatico.setPassarDia(dia+1);
            bancoEstatico.verificaFatura();
        }while (opcao!=0);
    }

    public static void switchCaseMenuInicial(int opcao) {
        switch (opcao) {
            case 1:
                EfetuarPagamento();
                break;
            case 2:
                deposito();
                break;
            case 3:
                if (contaLogada instanceof Corrente || contaLogada instanceof Poupanca){
                    saque();
                }
                break;
            case 4:
                if (contaLogada instanceof Corrente){
                    fazerTranferencia();
                }
                break;
            case 0:
                break;
        }
    }

    private static void EfetuarPagamento() {
        System.out.println("Qual o valor do pagamento?");
        double valor = sc.nextDouble();
        System.out.println(contaLogada.pagamento(valor));
    }

    private static void saque() {
        System.out.println("Quanto você quer sacar?");
        double valor = sc.nextDouble();
        System.out.println(contaLogada.pagamento(valor));
    }

    private static void deposito() {
        System.out.println("Quanto você deseja depositar?");
        double valor = sc.nextDouble();
        contaLogada.credito(valor);
    }

    private static void fazerTranferencia() {
        System.out.println("Clique no numero da conta que deseja tranferir");
        System.out.println(bancoEstatico.getContas());
        int opcao = sc.nextInt();
        if (bancoEstatico.numeroDaConta(opcao)!=null){
            Conta destinataria = bancoEstatico.numeroDaConta(opcao);
            System.out.println("Qual Valor");
            double valor = sc.nextDouble();
            System.out.println(((Corrente)contaLogada).transferencia(destinataria,valor));
        }else{
            System.out.println("este destinatario não existe");
        }

    }
}
