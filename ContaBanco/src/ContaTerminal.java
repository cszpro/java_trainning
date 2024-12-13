import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        //Apresentando qual é o objetivo da aplicação ao usuário
        System.out.println("VAMOS REALIZAR A ABERTURA DA SUA CONTA.");
        System.out.println("-- Digite as informações solicitadas a seguir --");
        
        //Captando as informações via terminal para abertura da conta
        System.out.println("\n1 - Por favor, digite o número da Conta com 4 dígitos!\\nExemplo: 1021");
        int conta = sc.nextInt();
        
        System.out.println("\n2 - Por favor, digite o número da Agência com 3 dígitos + digito verificador!\nExemplo: 067-8");
        String agencia = sc.next();

        System.out.println("\n3 - Por favor, digite o saldo que deseja iniciar!\nExemplo: 237.48");
        double saldo = sc.nextDouble();

        System.out.println("\n4 - Por favor, digite o seu nome completo!\nExemplo: MARIO ANDRADE");
        String nomeCliente = sc.next();        

        //Exibindo a mensagem de sucesso na abertura de conta
        System.out.println("\n\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque\n");
    }
}
