import java.util.*;
public class preencherVetorMult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetorX = new int[10];

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite um número inteiro: ");
            vetorX[i] = sc.nextInt();
        }

        escreveVetor(preencherVetorMultiplicando(vetorX));

        sc.close();
    }

    public static int[] preencherVetorMultiplicando(int vetor1[]) {
        int[] vetor = new int[10];

        for(int i = 0; i < 10; i++) {
            if(i%2 == 0) {
                vetor[i] = vetor1[i] * 2;
            } else {
                vetor[i] = vetor1[i] * 3;
            }
        }
        return vetor;
    }

    public static void escreveVetor(int vetor[]) {
        System.out.println("===");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("===");
    }

}