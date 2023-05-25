import java.util.Scanner;

public class ExeSelecao09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero de eleitores: ");
        double eleitores = sc.nextDouble();

        System.out.println("Entre com o numero de votos brancos: ");
        double vtBranco = sc.nextDouble();

        System.out.println("Entre com o numero de votos nulos: ");
        double vtNulo = sc.nextDouble();
        
        System.out.println("Entre com o numero de validos: ");
        double vtValid = sc.nextDouble();

        double porcentB = ((vtBranco * 100) / eleitores);
        double porcentN = ((vtNulo * 100) / eleitores);
        double porcentV = ((vtValid * 100) / eleitores);
        
        System.out.println("Resultado: ");
        System.out.println(porcentB + "% de votos brancos");
        System.out.println(porcentN + "% de votos nulos");
        System.out.println(porcentV + "% de votos validos");


        sc.close();
    }
}
