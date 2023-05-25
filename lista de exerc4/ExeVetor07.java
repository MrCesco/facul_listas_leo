import java.util.*;
public class ExeVetor07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetorX = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro: ");
            vetorX[i] = sc.nextInt();
        }

        int[] vetorY = new int[10];

        for(int i = 0; i < 10; i++) {
            if(i%2 == 0) {
                vetorY[i] = vetorX[i] * 2;
            } else {
                vetorY[i] = vetorX[i] * 3;
            }
        }

        System.out.println("===");
        for(int i = 0; i < 10; i++) {
            System.out.println(vetorY[i]);
        }
        System.out.println("===");

        sc.close();
    }
}