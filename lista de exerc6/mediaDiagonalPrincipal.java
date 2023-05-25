import java.util.Random;

public class mediaDiagonalPrincipal {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        int media = fazerMediaDiagonalPrincipal(matriz);

        System.out.println("A média dos elementos da diagonal principal é: "+media);
    }

    public static int fazerMediaDiagonalPrincipal(int matriz[][]) {
        int soma = 0;
        int k = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i==j){
                    soma += matriz[i][j];
                    k++;
                }
            }
        }
        int media = soma/k;
        return media;
    }
}
