import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner numeroScanner = new Scanner(System.in); //Criei o scanner
        
        System.out.println("Digite o primeio numero"); //Pede ao usuário que insira os numeros
        String n1 = numeroScanner.nextLine();
        
        System.out.println("Digite o segundo numero");
        String n2 = numeroScanner.nextLine();

        System.out.println("Digite o terceiro numero");
        String n3 = numeroScanner.nextLine();

        System.out.println("Digite o quarto numero");
        String n4 = numeroScanner.nextLine();

        //Transformei as Strings em valores e somei seus valores
        int soma = Integer.parseInt(n1)
        + Integer.parseInt(n2)
        + Integer.parseInt(n3)
        + Integer.parseInt(n4);

        System.out.println("A soma desses numeros e:" + soma); //Imprimi a soma desses valores

        numeroScanner.close(); //Fecho o scanner

    }
}
/*PS: tive que assistir alguns videos no Youtube e ler os slides novamente
para poder fazer este exercicio*/