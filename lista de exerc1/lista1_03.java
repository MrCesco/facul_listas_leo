import java.util.Scanner;

public class lista1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = sc.nextInt();
        System.out.println("Digite o quarto número: ");
        int n4 = sc.nextInt();
        int med = ((n1 + n2 + n3 + n4)/4);
        System.out.println("A média aritmética é igual a:" + med);

        sc.close();
    }
}