import java.util.Locale;
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner novoScanner = new Scanner(System.in).useLocale(Locale.US); //Scanner criado

        System.out.println("Digite o salario inicial:"); //Solicito o valor inicial
        String vi = novoScanner.nextLine();

        System.out.println("Digite o percentual de aumento:"); //Solicito o aumento em porcentagem
        String p = novoScanner.nextLine();

        Double taxa = Double.parseDouble(p) / 100; //Utilizo o calculo de taxa onde multiplico o percentual por 100


        Double va =  Double.parseDouble(vi) * taxa; //Multiplico o valor inicial pela taxa para obter o aumento salarial
        
        Double ns = Double.parseDouble(vi) + va; //Somo o valor inicial ao valor aumentado e obtenho o novo salario

        //Retorno os dados
        System.out.println("--------RESULTADO--------");
        System.out.println("Valor inicial: " + vi);
        System.out.println("Aumento percentual de: %" + p);
        System.out.println("Aumento de: " + va);
        System.out.println("Novo salario: " + ns);
        
        novoScanner.close();
    }
}
/*Formúlas ultilizadas:
Salario final = Salario inicial * (1 + taxa)
Valor do aumento = Salario inicial * taxa
*/