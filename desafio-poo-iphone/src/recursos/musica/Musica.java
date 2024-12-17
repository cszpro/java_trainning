package recursos.musica;

public class Musica implements ReprodutorMusical {
    public void tocarMusica() {
        System.out.println("Tocando músicas pelo App Música");
    }

    public void pausarMusica() {
        System.out.println("Pausando a música pelo App Música");
    }

    public void passarFaixa() {
        System.out.println("Mudando para a próxima faixa pelo App Música");
    }

    public void voltarFaixa() {
        System.out.println("Voltando para a faixa anterior pelo App Música");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando o volume pelo App Música");
    }

    public void diminuirVolume() {
        System.out.println("Baixando o volume pelo App Música");
    }

}
