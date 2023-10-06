import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.next();

        double saldo = 639.48;//considerei um saldo já pré-estabelecido para simular melhor um banco
        /*
        System.out.println("Por favor, digite o valor do saldo");
        double saldo = scanner.nextDouble(); 
        */
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta número " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
        
    }
}

