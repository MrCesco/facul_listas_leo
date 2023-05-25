import java.util.Scanner;

public class ExeSelecao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        
       
        if(n1 >= 100 && n1 <= 200){
            System.out.printf("%d está no intervalo(100, 200)%n", n1);
        } else {
            System.out.printf("%d não está no intervalo(100, 200)%n", n1);
        }         

        sc.close();
    }
}
    