import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua conta, por favor!");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da sua agência, por favor!");
        String agencia = scanner.next();

        System.out.println("Digite seu nome, por favor!");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome, por favor!");
        String sobrenome = scanner.next();

        double saldo = 500.35;

        System.out.println("Olá, " + nome + " " + sobrenome + "!");
        System.out.println("Obrigada por criar sua conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ".");
        System.out.println("Numéro da sua conta é " + numero + ".");
        System.out.println("E seu saldo no valor " + saldo + " já está disponível para saque!");
    }
}
