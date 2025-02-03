import java.util.concurrent.ThreadLocalRandom;
public class exemploWhile {
    public static void main(String[] args) throws Exception {
        double mesada = 50.00;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) 
                valorDoce = mesada;
            System.out.println("Doce do valor " + valorDoce + " adicionado no carrinho"); 
            mesada = mesada - valorDoce;
        }
        System.out.println("mesada:" + mesada);
        System.out.println("Acabou a mesada");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
