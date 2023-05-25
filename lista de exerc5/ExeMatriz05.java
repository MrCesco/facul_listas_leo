import java.util.*;

public class ExeMatriz05 {
    public static void main(String[] args) {
        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];
        int[][] matrizS = new int[5][5];
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Preencha a matriz A: ");
        for(int i=0;i < matrizA.length;i++) {
            for(int j=0;j < matrizA[i].length;j++) {
                matrizA[i][j] = sc.nextInt();
            }
        }
        System.out.println("===");
        System.out.println("Preencha a matriz B: ");
        for(int i=0;i < matrizB.length;i++) {
            for(int j=0;j < matrizB[i].length;j++) {
                matrizB[i][j] = sc.nextInt();
            }
        }
        System.out.println("===");
        for(int i=0;i < matrizB.length;i++) {
            for(int j=0;j < matrizB[i].length;j++) {
                matrizS[i][j]=matrizA[i][j] + matrizB[i][j];
                System.out.println(matrizS[i][j]);
            }
        }

        sc.close();
    }
}
