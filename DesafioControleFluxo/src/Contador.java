
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        } else {
            int contador = numero2 - numero1;
            System.out.println("\n| IMPRESSORA DE NÚMEROS |");
            System.out.println("Você vai imprimir " + contador + " números abaixo.\n");

            for (int i = 1; i <= contador; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }

    }
}
