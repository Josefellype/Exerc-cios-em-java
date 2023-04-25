import java.util.Scanner;

public class OrdenacaoVetorGPT {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        int temp;

        // Preenche o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número inteiro: ");
            vetor[i] = scanner.nextInt();
        }
        
        // Ordena o vetor em ordem crescente
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i+1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        
        // Imprime o vetor ordenado
        System.out.println("Vetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i+1) + "º: " + vetor[i]);
        }

    }

}
