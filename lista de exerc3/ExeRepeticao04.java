import java.util.Scanner;

public class ExeRepeticao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        boolean crescente, decrescente;
        
        do {
            System.out.print("Digite o primeiro valor da dupla: ");
            valor1 = sc.nextInt();
            
            System.out.print("Digite o segundo valor da dupla: ");
            valor2 = sc.nextInt();
            
            if (valor1 < valor2) {
                crescente = true;
                decrescente = false;
            } else if (valor1 > valor2) {
                crescente = false;
                decrescente = true;
            } else {
                break;
            }
            
            if (crescente) {
                System.out.println("A dupla foi informada em ordem crescente.");
            } else if (decrescente) {
                System.out.println("A dupla foi informada em ordem decrescente.");
            }
        } while (valor1 != valor2);


        sc.close();
    }
}

