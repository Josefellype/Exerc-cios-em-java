import java.util.Scanner;

public class Progidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        String idadeString = scanner.nextLine();
           try {
            int idade = Integer.parseInt(idadeString);
                if (idade < 0) {
                    System.out.println("Idade inválida. Por favor, digite uma idade válida!");
                }
                if (idade < 18) {
                    System.out.println(nome + " é menor de idade!");
                } else { 
                    System.out.println(nome + " é maior de idade!");
                } break;
            } catch (NumberFormatException e) {
                System.out.println("Idade inválida. Por favor, digite uma idade válida");
            }
        }
    }
}