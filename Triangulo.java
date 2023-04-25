import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;

        System.out.println("Digite o tamanho do primeiro lado do triângulo!");
        x = sc.nextInt();

        System.out.println("Digite o tamanho do segundo lado do triângulo!");
        y = sc.nextInt();

        System.out.println("Digite o tamanho do terceiro lado do triângulo!");
        z = sc.nextInt();

        sc.close();

        if(x+y < z){
            System.out.println("Não pode se formar um triângulo com os tamanhos dos lados informados!");
            System.exit(0);
        } else {
            if(x == y && y == z)
                System.out.println("O triângulo é equilátero!");
                else if(x == y && y != z)
                    System.out.println("O triângulo é equilátero!");
                    else if(z == x && x !=y)
                        System.out.println("O triângulo é equilátero!");
                        else if(y == z && y != z)
                            System.out.println("O triângulo é isósceles!");
                            else if(x != y && y != z)
                                System.out.println("O triângulo é escaleno!");
        }
    }
}
