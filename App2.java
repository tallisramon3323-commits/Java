import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner numeroScanner = new Scanner(System.in); //Criei o scanner
        
        System.out.println("Digite o primeio numero"); //Pede ao usuário que insira os numeros
        String n1 = numeroScanner.nextLine();
        
        System.out.println("Digite o segundo numero");
        String n2 = numeroScanner.nextLine();

        System.out.println("Digite o terceiro numero");
        String n3 = numeroScanner.nextLine();


        //Transformei as Strings em valores e somei seus valores
        int soma = Integer.parseInt(n1) 
        + Integer.parseInt(n2)
        + Integer.parseInt(n3);

        System.out.println("A media desses numeros e:" + (soma / 3.0)); //Imprimi a soma desses valores e dividi o resultado por 3

        numeroScanner.close();

    }
}
/*PS: tive que assistir alguns videos no Youtube e ler os slides novamente
para poder fazer este exercicio*/