import java.util.Random;

public class ExeMatriz02 {
    public static void main(String[] args) {
        int[][] matrizM = new int[6][8];
        Random random = new Random();
        
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = random.nextInt(21) - 10;
            }
        }
        
        int[] vetorC = new int[matrizM.length];
        
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (matrizM[i][j] < 0) {
                    vetorC[i]++;
                }
            }
        }
        
        System.out.println("Matriz M:");
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.println(matrizM[i][j] + " ");
            }
        }
        
        System.out.println("Vetor C:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
