import java.util.Scanner;

public class lista1_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Converta polegadas em milímetros, digite o número em polegadas: ");
        float polegadas = sc.nextFloat();

        float mm = (polegadas)*(float)25.4;
        System.out.printf("%.0f equivale a %.1f%n", polegadas, mm);

        sc.close();
    }
}