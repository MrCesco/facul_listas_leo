import java.util.Scanner;

public class ExeSelecao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

        if(n1 %2==0){
            System.out.println("Número lido é par");
        } else {
            System.out.println("Número lido é impar");
        }
               

        sc.close();
    }
}
    