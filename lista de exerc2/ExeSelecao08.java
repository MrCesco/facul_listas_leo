import java.util.Scanner;

public class ExeSelecao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leitura dos valores
        System.out.println("Digite o primeiro valor:");
        int valor1 = sc.nextInt();
        
        System.out.println("Digite o segundo valor:");
        int valor2 = sc.nextInt();
        
        System.out.println("Digite o terceiro valor:");
        int valor3 = sc.nextInt();
        
        // Ordenação dos valores
        int temp;
        
        if (valor1 < valor2) {
            temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }
        
        if (valor2 < valor3) {
            temp = valor2;
            valor2 = valor3;
            valor3 = temp;
        }
        
        if (valor1 < valor2) {
            temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }
        
        // Exibição dos valores em ordem decrescente
        System.out.println("Valores em ordem decrescente: " + valor1 + ", " + valor2 + ", " + valor3);

        sc.close();
    }
}
