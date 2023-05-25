import java.util.Random;

public class vetorNegativo {
    public static void main(String[] args) {
        int[][] matrizM = new int[6][8];
        Random random = new Random();
        
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = random.nextInt(21) - 10;
            }
        }

        escreveMatriz(matrizM);

        int[] vetorC = new int[matrizM.length];
        vetorC = vetorNegativa(matrizM);

        System.out.println("Vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }

    public static int[] vetorNegativa (int matriz[][]) {
        int[] vetorC = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    vetorC[i]++;
                }
            }
        }
        return vetorC;
    }

    public static void escreveMatriz (int matriz[][]) {         
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 9; j++) {
                System.out.println(matriz[i][j] + " ");
            }
        }
    }

}
