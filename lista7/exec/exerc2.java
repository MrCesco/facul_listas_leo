package exec;
import java.util.*;
import models.*;

public class exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao CD Player, digite abaixo quantas músicas você gostaria de ouvir: ");
        int m = sc.nextInt();
        Cd cd1 = new Cd(m);

        System.out.println("====================");
        System.out.println("Digite 1 para dar play\nDigite 2 para dar pause");
        System.out.println("Digite 3 para dar stop\nDigite 4 para ir para próxima faixa");
        System.out.println("Digite 5 para voltar para voltar a faixa\nDigite 0 para sair do CD Player");
        System.out.println("====================");

        boolean continuar = true;
        while (continuar) {
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    cd1.play();
                    break;
            
                case 2:
                    cd1.pause();
                    break;
            
                case 3:
                    cd1.stop();
                    break;
            
                case 4:
                    cd1.next();
                    break;
            
                case 5:
                    cd1.previous();
                    break;
            
                case 0:
                    System.out.println("Você escolheu sair");
                    continuar = false;
                    break;
            
                default:
                    System.out.println("Erro, digite um número válido!");
                    break;
            }
        }

        sc.close();
    }
}
