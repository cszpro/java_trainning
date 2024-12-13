
public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("STATUS INICIAL");
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual " + smartTv.canal);
        System.out.println("Volume Atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("\nNovo Status\nTV Ligada? " + smartTv.ligada);

        System.out.println("\nNovo Status\nVolume Atual? " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("\nNovo Status\nVolume Atual? " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("\nVolume Atual? " + smartTv.volume);

        System.out.println("\nCanal Atual " + smartTv.canal);
        smartTv.mudarCanal(17);
        System.out.println("\nNovo Status\nCanal Atual " + smartTv.canal);

        smartTv.desligar();
        System.out.println("\nNovo Status\nTV Ligada? " + smartTv.ligada);

    }
}
