import java.util.Scanner;

public class Conta {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Float saldo;

    public Conta() {

    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    @Override 
    public String toString() {
        return "Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque";
    }

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        this.setNomeCliente(scanner.nextLine());
        System.out.println("Informe o número da conta");
        this.setNumero(scanner.nextInt());
        System.out.println("Informe a agencia:");
        scanner.nextLine();
        this.setAgencia(scanner.nextLine());
        System.out.println("Informe o saldo:");
        this.setSaldo(scanner.nextFloat());
    }
}
