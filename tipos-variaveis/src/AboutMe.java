
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        double nome = scanner.nextDouble();

        System.out.println("Digite seu sobrenome");
        double sobrenome = scanner.nextDouble();
        
        System.out.println("Digite sua idade");
        double idade = scanner.nextDouble();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        

        //imprimindo os dados obtidos pelo usuario

        System.out.println("Ola, me chamo" + nome + "" + sobrenome);
        System.out.println("Tenho" + idade + " anos ");
        System.out.println("Minha altura é" + altura + "cm ");
    }
}
