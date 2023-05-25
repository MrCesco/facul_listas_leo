import java.util.Scanner;

public class ExeSelecao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero de laranjas a serem compradas: ");
        int laranjas = sc.nextInt();

        double valor = 0, valorF;

        if(laranjas >= 12) {
            valor = 0.25;
        } else if (laranjas > 0 && laranjas < 12) {
            valor = 0.30;
        } else if (laranjas <= 0) {
            System.out.println("Nenhum item está sendo comprado");
            return;
        }

        valorF = laranjas * valor;


        System.out.println("--- Valor da compra ---");
        System.out.printf("%d unidade(s) de laranja a R$ %.2f a unidade = R$ = %.2f", laranjas, valor, valorF);

        sc.close();
    }
}
