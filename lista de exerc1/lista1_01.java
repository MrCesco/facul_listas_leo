import java.util.Scanner;

public class lista1_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro n�mero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo n�mero: ");
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        System.out.println("A soma � igual a:" + soma);

        sc.close();
    }
}
    