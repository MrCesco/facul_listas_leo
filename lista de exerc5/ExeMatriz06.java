import java.util.Random;

public class ExeMatriz06 {
    public static void main(String[] args) {
        int[][] matrizM = new int[6][6];
        int[] vetorV = new int[36];
        Random random = new Random();
        
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = random.nextInt(50);
            }
        }

        System.out.println("Matriz M: ");
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.println(matrizM[i][j]);
            }
        }
        System.out.println("===");
        int valorA = 2;
        System.out.println("Valor A: "+valorA);

        int k = 0;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                vetorV[k] = (matrizM[i][j])*valorA;
                k++;
            }
        }

        System.out.println("===");
        for (int i = 0; i < vetorV.length; i++) {
            System.out.println(vetorV[i]);
        }

    }
}
