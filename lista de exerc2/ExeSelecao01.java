import java.util.Scanner;

public class ExeSelecao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

        if(n1 > 100){
            System.out.println("Número lido é maior que 100");
        } else {
            System.out.println("Número lido não é maior que 100");
        }
               

        sc.close();
    }
}
    