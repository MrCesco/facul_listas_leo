public class ExeVetor05 {
    public static void main(String[] args) {

        int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
        int[] vetorB = {2,4,6,8,10,12,14,16,18,20};
        int[] vetorC = new int[10];

        for(int i = 0; i < 10; i++) {
            int result = vetorA[i] * vetorB[i];
            vetorC[i] = result;
            System.out.println(vetorA[i]+"x"+vetorB[i]+"="+vetorC[i]);
        }
    }
}