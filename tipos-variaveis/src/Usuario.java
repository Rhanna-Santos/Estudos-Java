public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV está ligada? " + smartTv.ligada);  
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada " + smartTv.ligada);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("Canal: " + smartTv.canal);
    }
    
}