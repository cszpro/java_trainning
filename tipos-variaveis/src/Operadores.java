public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
        System.out.println(nomeCompleto);

        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println(simNao);

        String nomeUm = "Gleyson";
        String nomeDois = new String("Gleyson");
        System.out.println(nomeUm.equals(nomeDois));

    }
}