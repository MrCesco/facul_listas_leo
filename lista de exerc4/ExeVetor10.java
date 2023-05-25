import java.util.*;
public class ExeVetor10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vetorP = new int[10];
        int[] vetorI = new int[10];

        int p = 0;
        int i = 0;

        while(true) {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();

            if(p==10) {
                break;
            } else if(i==10) {
                break;
            } else if(num==0) {
                break;
            } 
            

            if(num%2==0) {
                vetorP[p] = num;
                p++;
            } else {
                vetorI[i] = num;
                i++;
            }
        }

        System.out.println("===");

        for(int cont = 0; cont < p; cont++) {
            System.out.println(vetorP[cont]);
        }

        for(int cont = 0; cont < i; cont++) {
            System.out.println(vetorI[cont]);
        }

        sc.close();
    }
}