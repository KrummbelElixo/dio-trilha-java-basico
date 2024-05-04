public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta();

        System.out.println("Cadastro da conta:");
        conta.lerDados();
        System.out.println(conta);
    }
}
