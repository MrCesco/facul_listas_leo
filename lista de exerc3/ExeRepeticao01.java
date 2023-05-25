import java.util.Scanner;

public class ExeRepeticao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro positivo:");
        int num = sc.nextInt();

        int i = 1;

        int numPar = 0;
        int numImpar = 0; 
        int somaPar = 0; 
        int somaImpar = 0;

        while(i <= num) {
            if(i%2 == 0) {
                numPar++;
                somaPar += i;
            } else {
                numImpar++;
                somaImpar += i;
            }
            
            i++;
        }

        System.out.printf("Tem %d números pares e %d impares entre 1 e %d%n", numPar, numImpar, num);
        System.out.println("Soma dos números pares: " + somaPar);
        System.out.println("Soma dos números ímpares: " + somaImpar);

        sc.close();
    }
}
