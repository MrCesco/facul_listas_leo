import java.util.Scanner;

public class ExeRepeticao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite dois números inteiros positivos sendo que o primeiro número deve ser menor que o segundo:");
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        if(numA >= numB) {
            System.out.println("O primeiro número não pode ser maior que o segundo!");
            return;
        }

        int i = numA;

        int soma = 0; 

        while(i <= numB) {
            if(i%5 == 0) {
                System.out.printf("O número %d é divisivel por 5. %n", i);
                soma += i;
            }

            i++;
        }
        
        System.out.println("Soma dos números encontrados: " + soma);

        sc.close();
    }
}
