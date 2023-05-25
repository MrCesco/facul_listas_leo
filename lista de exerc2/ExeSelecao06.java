import java.util.Scanner;

public class ExeSelecao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os 3 lados do triangulo: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
       
        if(n1 < n2 + n3 && n2 < n1 + n3 && n3 < n1 + n2){
            System.out.printf("Regras para formar um triângulo: (A < B + C) e (B < A + C) e (C < A + B)%n Os lados formam um triangulo");
        } else {
            System.out.printf("Regras para formar um triângulo: (A < B + C) e (B < A + C) e (C < A + B)%n Os lados não formam um triangulo");
        }         

        sc.close();
    }
}
    