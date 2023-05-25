import java.util.Scanner;

public class lista1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();
        
        System.out.printf("(1)Valor de X é: %d%n", x);

        System.out.printf("(2)O quadrado de X é: %d%n", (x*x));

        System.out.printf("(3)O resto da divisão inteira de X por 3 é: %d%n", (x%3));

        System.out.printf("(4)A metade de X é: %.1f%n", (float)x/2);

        System.out.printf("(5)O resultado do produto de X pela metade de X é: %.2f%n", (float)x * ((float)x /2));

        sc.close();
    }
}