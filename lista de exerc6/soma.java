import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
       
        int result = somar(n1, n2);

        System.out.println("Resultado da soma é: "+result);

        sc.close();
    }
    
    public static int somar (int n1, int n2) {
        return n1 + n2;
    }
}
    

