import java.util.Scanner;

public class Q1provacfor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        int contDig = 1;

        System.out.println("Digite um número: ");
        num = sc.nextLong();

        sc.close();

        for(int i = 10; i < 1000000000; i*=10){
            if(num >= 1000000000)
                break;
            else 
                if(num < i){
                    contDig = 1;
                    break;
                }
            else {
                contDig++;
                if(num >= i && num < i*10){
                break;
                }
            }
        }
        if(contDig == 1 && num > 10)
            System.out.println("O número "+num+" possui 10 ou mais digitos!");
        else
            System.out.println("O número "+num+" possui "+contDig+" digitos!");
    }
}