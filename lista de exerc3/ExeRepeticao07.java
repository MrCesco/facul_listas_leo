import java.util.Scanner;

public class ExeRepeticao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;

        while(num != 0) {

            System.out.println("Digite um número positivo: ");
            num = sc.nextInt();
            
            for(int i = 1; i <= num; i++) {
                int result = num * i;
                System.out.println(num + "x" + i + "=" + result);
    
                if(i==num) {
                    break;
                }
            }      
        }


        sc.close();
    }
}
