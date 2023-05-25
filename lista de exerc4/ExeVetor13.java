public class ExeVetor13 {
    public static void main(String[] args) {
        
        int tamanhoVetor = 10;
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
        int[] vetorB = {2,3,4,4,6,6,9,10,11,12};
        int[] vetorC = new int[tamanhoVetor];
        int contC = 0;

        for(int i = 0;i < vetorA.length;i++) {
            for(int j = 0;j < vetorB.length;j++) {
                if(vetorA[i]==vetorB[j]) {
                    vetorC[contC] = vetorA[i];
                    contC++;
                    break;
                }
            }
        }

        for(int i = 0; i < tamanhoVetor; i++) {
            System.out.println(vetorC[i]);
        }
        

    }
}