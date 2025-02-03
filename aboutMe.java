import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class aboutMe {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Qual é o seu nome?");
            String nome = scanner.next();

            System.out.println("Qual é o seu sobrenome?");
            String sobrenome = scanner.next();

            System.out.println("Qual é a sua idade?");
            int idade = scanner.nextInt();

            System.out.println("Qual é a sua altura?");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + sobrenome.toUpperCase()); 
            System.out.println("twnho " + idade + " anos");
            System.out.println("minha altura é " + altura + "m");
            scanner.close();
        }
        catch (InputMismatchException  e ) {
            System.out.println("O campos idade e altura precisam ser números");
        }  

    }
    
}