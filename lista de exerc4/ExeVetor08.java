import java.util.*;
public class ExeVetor08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetorM = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro: ");
            vetorM[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++) {
           int aux = 0;

           aux = vetorM[i];
           vetorM[i] = vetorM[i+5];
           vetorM[i+5] = aux;
        }

        System.out.println("===");

        for(int i = 0; i < 10; i++) {
            System.out.println(vetorM[i]);
        }

        sc.close();
    }
}