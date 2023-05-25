import java.util.*;

public class ExeVetor12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[10];

        int escolha;
        double result1 = 0;
        double result2 = 0;
        double result3 = 0;
        double media = 0;

        for(int i = 0; i < 6; i++) {
            System.out.println("Preencha o vetor de 6 posições: ");
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Escolha a opção desejada: \n1- Soma dos elementos\n2- Produto dos elementos\n3- Média dos elementos\n4- Mostre o vetor");
        escolha = sc.nextInt();

        if(escolha==1) {
            for(int i = 0; i < 6; i++) {
                result1 += vetorA[i];
            }
            System.out.println("A soma dos elementos é: "+result1);
        } else if(escolha==2) {
            result2 = vetorA[0] * vetorA[1] * vetorA[2] * vetorA[3] * vetorA[4] * vetorA[5];
            System.out.println("O produto dos elementos é: "+result2);
        } else if(escolha==3) {
            for(int i = 0; i < 6; i++) {
                media += vetorA[i];
                result3 = media/i;
            }
            System.out.println("A média dos elementos é: "+result3);
        } else if(escolha==4) {
            System.out.println("===");
            for(int i = 0; i < 6; i++) {
                System.out.println(vetorA[i]);
            }
        } else {
            System.out.println("Escolha uma opção válida!");
        }      

        sc.close();
    }
}