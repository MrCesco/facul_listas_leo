import java.util.*;
public class ExeVetor09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro para o vetorA: ");
            vetorA[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro para o vetorB: ");
            vetorB[i] = sc.nextInt();
        }
        
        System.out.println("===");

        for(int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(vetorC[i]);
        }

        sc.close();
    }
}