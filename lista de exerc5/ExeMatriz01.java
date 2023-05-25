import java.util.*;

public class ExeMatriz01 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][9];
        
        Random random = new Random();
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 9; j++) {
                matriz[i][j] = random.nextInt(100); 
            }
        }        
        
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 9; j++) {
                System.out.println(matriz[i][j] + " ");
            }
        }
        
        int soma = 0;
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 9; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
}
