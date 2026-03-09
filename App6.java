import java.util.Scanner;
import java.util.Locale;

public class App6 {
    public static void main(String[] args) {
        Scanner novoScanner = new Scanner(System.in).useLocale(Locale.US);//Criei o Scanner
        System.out.println("Digite o salário:");//Solicito o salario
        String salario = novoScanner.nextLine();
        
        double percentualPos = 5.0 / 100;//Crio o percentual positivo que equivale a 5%

        Double aumento = Double.parseDouble(salario) * percentualPos;

        double percentualNeg = 7.0 / 100;//Crio o percentual negativo que equivale a 7%

        Double imposto =  Double.parseDouble(salario) * percentualNeg;

        double resultado = Double.parseDouble(salario) + aumento - imposto;//Adiciono a gratificacao e retiro o percentual de imposto

        System.out.println("Salario: " + resultado);//retorno os dados

        novoScanner.close();

    }
    
}