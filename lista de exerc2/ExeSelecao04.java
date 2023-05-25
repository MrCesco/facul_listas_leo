import java.util.Scanner;

public class ExeSelecao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        
        System.out.println("Digite outro número: ");
        int n2 = sc.nextInt();

        if(n1 < n2){
            System.out.printf("Número %d é menor que %d%n", n1, n2);
        } else if(n2 < n1){
            System.out.printf("Número %d é menor que %d%n", n2, n1);
        }
               

        sc.close();
    }
}
    