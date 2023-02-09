import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o nome da pesssoa: ");
            String nome = scan.nextLine();
            System.out.println("Digite a idade de" + nome + ":");
            int idade = scan.nextInt();
            if(idade < 18)
            {
                System.out.println(nome + " é menor de idade.");
            } else 
            {
                System.out.println(nome + " é maior de idade.");
            }
        }
        }
}