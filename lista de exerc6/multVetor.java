public class multVetor {
    public static void main(String[] args) {

        int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
        int[] vetorB = {2,4,6,8,10,12,14,16,18,20};

        multiplicaVetor(vetorA, vetorB);
    }

    public static void multiplicaVetor(int vetor1[], int vetor2[]) {
        int[] vetor3 = new int[10];
        for(int i = 0; i < 10; i++) {
            int result = vetor1[i] * vetor2[i];
            vetor3[i] = result;
            System.out.println(vetor1[i]+"x"+vetor2[i]+"="+vetor3[i]);
        }
    }
}