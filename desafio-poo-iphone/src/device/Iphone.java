package device;

// importandeo as implementações
import recursos.internet.Safari;
import recursos.musica.Musica;
import recursos.telefonia.Telefone;

public class Iphone {

    public static void main(String[] args) {
        // criando intâncias
        Telefone telefone = new Telefone();
        Musica musica = new Musica();
        Safari internet = new Safari();

        // Mensagem de abertura do programa
        System.out.println("IPHONE 2007");
        System.out.println("___________");

        // Executando o App telefone
        telefone.fazerChamada();
        telefone.encerrarChamada();
        telefone.enviarSms();
        telefone.receberSms();
        
        // Executando o App musica
        musica.tocarMusica();
        musica.pausarMusica();
        musica.passarFaixa();
        musica.voltarFaixa();
        musica.aumentarVolume();
        musica.diminuirVolume();

        // Executando o App safari
        internet.abrirBrowser();
        internet.navegarParaUrl();

    }
}
