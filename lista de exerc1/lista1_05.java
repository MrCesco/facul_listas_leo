import java.util.Scanner;

public class lista1_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float raio, areaCirculo, pi = (float) 3.141592;

        System.out.println("Digite o raio de um circulo: ");
        raio = sc.nextFloat();

        areaCirculo = pi *(raio*raio);

        System.out.printf("A area do circulo é: %.f%n", areaCirculo);
        
        sc.close();
    }
}