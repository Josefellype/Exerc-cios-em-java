import java.util.Scanner;

public class CorretorOrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite alguma coisa: ");
        char plvr[] = sc.nextLine().toCharArray();
        int i;
        int sin=0;
        for(i = 1; i < plvr.length; i++){
                if(plvr[i] == 'p' || plvr[i] == 'P' || plvr[i] == 'b' || plvr[i] == 'B'){
                    if(plvr[i-1] == 'n')
                        plvr[i-1] = 'm';
                    if(plvr[i-1] == 'N')
                    plvr[i-1] = 'M';
                }
                if(plvr[i-1] == 'm' || plvr[i-1] == 'M'){
                    System.out.println("A palavra está correta!");
                    sin = 1;
                    break;
                }
            if(sin == 1)
                break;
        }
        System.out.print("A palavra corrigida fica assim: ");
        System.out.println(plvr);
    }

}
