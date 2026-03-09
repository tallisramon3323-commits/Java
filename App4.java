import java.util.Scanner;
import java.util.Locale;

public class App4 {
    public static void main(String[] args) {
        Scanner novoScanner = new Scanner(System.in).useLocale(Locale.US);//Criei o scanner

        System.out.println("Digite o salario do funcionario: ");//Solicitei o salario ao usuario
        String s1 = novoScanner.nextLine();

        Double percentual = 1.25;//Defini a porcentagem de 25% de aumento

        Double ns = Double.parseDouble(s1) * percentual;//Calculei o aumento

        //Retornei os dados
        System.out.println("Novo salario com 25% de aumento: " + ns);

        novoScanner.close();


    }
}
