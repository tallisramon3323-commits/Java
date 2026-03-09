import java.util.Scanner;
import java.util.Locale;
public class App3 {
    public static void main(String[] args) throws Exception {
     Scanner numeroScanner = new Scanner(System.in).useLocale(Locale.US); //Criei o scanner

     System.out.println("Digite o primeio numero"); //Pede ao usuário que insira os numeros
     String n1 = numeroScanner.nextLine();

     System.out.println("Digite o segundo numero");
     String n2 = numeroScanner.nextLine();

     System.out.println("Digite o terceiro numero");
     String n3 = numeroScanner.nextLine();

     

     System.out.println("Digite o peso 1"); //Pede ao usuário que insira os pesos
     String p1 = numeroScanner.nextLine();

     System.out.println("Digite o peso 2");
     String p2 = numeroScanner.nextLine();

     System.out.println("Digite o peso 3");
     String p3 = numeroScanner.nextLine();


     //Transformei as Strings em valores e calculei segundo a formúla de média ponderada
     double Peso1 = Double.parseDouble(n1) * Integer.parseInt(p1); //(N1*P1)
     double Peso2 = Double.parseDouble(n2) * Integer.parseInt(p2); //(N2*P2)
     double Peso3 = Double.parseDouble(n3) * Integer.parseInt(p3); //(N3*P3)
 
     //(N1*P1) + (N2*P2) + (N3*P3)
     Double resultadoSoma = Peso1 + Peso2 + Peso3;

     //Somei os pesos
     Double pesos = Double.parseDouble(p1) + Double.parseDouble(p2) + Double.parseDouble(p3);
     Double resultadoFinal = resultadoSoma / pesos; 
     System.out.println("A soma desses numeros e:" + resultadoFinal); //Imprimi a soma desses valores

    numeroScanner.close();

     }
}