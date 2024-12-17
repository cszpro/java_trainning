package recursos.telefonia;

public class Telefone implements AparelhoTelefonico {
    public void fazerChamada() {
        System.out.println("Fazendo ligação pelo App Telefone");
    } 

    public void encerrarChamada() {
        System.out.println("Encerrando a chamada pelo App Telefone");
    } 

    public void enviarSms() {
        System.out.println("Enviando Sms pelo App Mensagens");
    } 

    public void receberSms() {
        System.out.println("Recebendo Sms pelo App Mensagens");
    } 

}
