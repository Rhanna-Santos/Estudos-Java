public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.00;
        double valorSocilitado = 22.00;

        if (valorSocilitado < saldo) {
           saldo = saldo - valorSocilitado;
           System.out.println("Novo Saldo: " +saldo);
    

        } else {
           System.out.println("Saldo insuficiente");
        }
     



    }
}
