public class comparaVetor {
    public static void main(String[] args) {
        
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
        int[] vetorB = {2,3,4,4,6,6,9,10,11,12};
        
        escreveVetor(comparaVetorIgual(vetorA, vetorB));

    }

    public static void escreveVetor (int vetor[]) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static int[] comparaVetorIgual (int vetor1[], int vetor2[]) {
        int[] vetor3 = new int[10];
        int contC = 0;

        for(int i = 0;i < vetor1.length;i++) {
            for(int j = 0;j < vetor2.length;j++) {
                if(vetor1[i]==vetor2[j]) {
                    vetor3[contC] = vetor1[i];
                    contC++;
                    break;
                }
            }
        }

        return vetor3;
    }
}
