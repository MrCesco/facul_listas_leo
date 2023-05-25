import java.util.Scanner;

public class media {
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
        
        int med = fazerMedia(n1, n2, n3, n4);
        System.out.println("A média aritmética é igual a: " + med);

        sc.close();
    }

    public static int fazerMedia (int n1, int n2, int n3, int n4) {
        return (n1 + n2 + n3 + n4)/4;
    }

}
