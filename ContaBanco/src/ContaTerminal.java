import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe a agencia: ");
        String agencia = sc.nextLine();

        System.out.print("Informe o numero da conta: ");
        int numero = sc.nextInt();

        System.out.print("Informe o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nome, agencia, numero, saldo);
    }
}
