import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

        if(ehPar(n1)==true){
            System.out.println("Número lido é par");
        } else {
            System.out.println("Número lido é impar");
        }               

        sc.close();
    }

    public static boolean ehPar (int num) {
        if(num%2==0){
            return true;
        } else {
            return false;
        }
    }
}
    