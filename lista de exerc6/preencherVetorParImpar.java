public class preencherVetorParImpar {
    public static void main(String[] args) {
        int tamanhoVetor = 10;
        int[] vetorB = new int[tamanhoVetor];        

        escreveVetor(preencherVetor(vetorB));
    }

    public static int[] preencherVetor(int vetor[]) {
        for(int i = 0; i < vetor.length; i++) {
            if (i%2==0) {
                vetor[i] = 20;
            } else {
                vetor[i] = 10;
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