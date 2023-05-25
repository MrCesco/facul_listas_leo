import java.util.Random;

public class ExeMatriz03 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random random = new Random();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(50);
            }
        }
        
        int soma0 = 0;
        int soma1 = 0;
        int soma2 = 0;
        int soma3 = 0;
        int soma4 = 0;     

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(j==0){
                    soma0 += matriz[i][j];
                } else if(j==1){
                    soma1 += matriz[i][j];
                } else if(j==2){
                    soma2 += matriz[i][j];
                } else if(j==3){
                    soma3 += matriz[i][j];
                } else if(j==4){
                    soma4 += matriz[i][j];
                }
            }
        }

        System.out.println("A soma dos elementos da coluna 0 é: " + soma0);
        System.out.println("A soma dos elementos da coluna 1 é: " + soma1);
        System.out.println("A soma dos elementos da coluna 2 é: " + soma2);
        System.out.println("A soma dos elementos da coluna 3 é: " + soma3);
        System.out.println("A soma dos elementos da coluna 4 é: " + soma4);        
    }
}
