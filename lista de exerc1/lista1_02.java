import java.util.Scanner;

public class lista1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int n3 = sc.nextInt();
        int soma = n1 + n2 + n3;
        System.out.println("A soma é igual a:" + soma);

        sc.close();
    }
}