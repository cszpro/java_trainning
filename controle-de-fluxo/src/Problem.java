import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = 3;
        String [] nomes = new String[tamanho];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um nome");
            nomes[i] = sc.nextLine();
            if (i == 2 ) {
                System.out.println(nomes[i]);
            }
        }

    }
}
