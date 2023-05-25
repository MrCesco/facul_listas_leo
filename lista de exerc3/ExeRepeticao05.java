import java.util.Scanner;

public class ExeRepeticao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número para fazer sua tabuada do 1 ao 10: ");
        int num = sc.nextInt();

        if(num <= 0) {
            return;
        }

        for (int i = 1; i <= 10; i++) {
           int result = num * i;
           System.out.println(result);
        }


        sc.close();
    }
}
