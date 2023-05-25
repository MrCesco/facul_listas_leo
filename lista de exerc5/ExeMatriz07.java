import java.util.Random;

public class ExeMatriz07 {
    public static void main(String[] args) {
        int[][] matrizM = new int[5][5];
        Random random = new Random();
        int somaA = 0;
        int somaB = 0;
        int somaC = 0;
        int somaD = 0;
        
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = random.nextInt(50);
            }
        }
        
        ////////////////////////////////////////////////////////////////////////////////
        for(int i = 0; i < matrizM.length; i++) {
            for(int j = 0; j < matrizM[i].length; j++) {
                if(i==4){
                    somaA += matrizM[i][j];
                }
            }
        }
        System.out.println("A soma dos elementos da linha 4 da matriz M é: " + somaA);
        ////////////////////////////////////////////////////////////////////////////////
        for(int i = 0; i < matrizM.length; i++) {
            for(int j = 0; j < matrizM[i].length; j++) {
                if(j==2){
                    somaB += matrizM[i][j];
                }
            }
        }
        System.out.println("A soma dos elementos da coluna 2 da matriz M é: " + somaB);
        ////////////////////////////////////////////////////////////////////////////////    
        for(int i = 0; i < matrizM.length; i++) {
            for(int j = 0; j < matrizM[i].length; j++) {
                if(i==j){
                    somaC += matrizM[i][j];
                }
            }
        }
        System.out.println("A soma dos elementos da diagonal principal da matriz M é: " + somaC);
        ////////////////////////////////////////////////////////////////////////////////
        for(int i = 0; i < matrizM.length; i++) {
            for(int j = 0; j < matrizM[i].length; j++) {
                somaD += matrizM[i][j];                
            }
        }
        System.out.println("A soma de todos elementos da matriz M é: " + somaD);
        ////////////////////////////////////////////////////////////////////////////////
    }
}
