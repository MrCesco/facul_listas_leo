import java.util.Random;

public class ExeMatriz04 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random random = new Random();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(50);
            }
        }

        int soma = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i%2==0){
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("A soma dos elementos das linhas pares são: " + soma);
    }
}
