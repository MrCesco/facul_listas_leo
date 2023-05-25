import java.util.Scanner;

public class lista1_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float n1 = sc.nextFloat();
        System.out.println("Digite o segundo número: ");
        float n2 = sc.nextFloat();
        System.out.println("Digite o terceiro número: ");
        float n3 = sc.nextFloat();
        System.out.println("Digite o quarto número: ");
        float n4 = sc.nextFloat();
        float med = ((n1 + n2 + n3 + n4)/4);
        System.out.printf("A média aritmética é igual a: %.2f", med);

        sc.close();
    }
}