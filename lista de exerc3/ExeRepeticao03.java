import java.util.Scanner;

public class ExeRepeticao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número para saber se ele é perfeito: ");
        int num = sc.nextInt();

        int i = 1;

        int soma = 0;

        while(i < num) {
            if(num%i == 0) {
                soma += i;
            }

            i++;
        }

        if(num == soma) {
            System.out.println(num +" é um número perfeito");
        } else {
            System.out.println("Não é um número perfeito");
        }


        sc.close();
    }
}
