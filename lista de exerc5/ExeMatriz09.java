import java.util.Random;

public class ExeMatriz09 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random random = new Random();
        int soma = 0;
        int k = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.println(matriz[i][j]);
            }
        }
        System.out.println("===");

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i+j==3){
                    soma += matriz[i][j];
                    k++;
                }
            }
        }
        int media = soma/k;

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i==j){
                    System.out.println((matriz[i][j])*media);
                }
            }
        }
    }
}
