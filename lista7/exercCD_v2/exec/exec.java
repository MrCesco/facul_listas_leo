package exercCD_v2.exec;

import java.util.*;
import exercCD_v2.models.*;

public class exec {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Musica> musicas = new ArrayList<>();
        musicas.add(new Musica("Oh No", 5.01f));
        musicas.add(new Musica("Throne", 3.11f));
        musicas.add(new Musica("Doomed", 4.34f));
        musicas.add(new Musica("Follow You", 3.51f));
        musicas.add(new Musica("Avalanche", 4.22f));
        musicas.add(new Musica("Blasphemy", 4.35f));
        musicas.add(new Musica("True Friends", 3.52f));
        musicas.add(new Musica("Happy Song", 3.59f));
        musicas.add(new Musica("Run", 3.42f));
        musicas.add(new Musica("Drown", 3.42f));
        musicas.add(new Musica("What You Need", 4.12f));
        CD cd1 = new CD("Bring Me the Horizon", "That's the Spirit", 2015, musicas, 11, 45.3f);
        
        CDPlayer cdp1 = new CDPlayer(cd1);
        System.out.println(cd1);
        System.out.println("====================");
        System.out.println("Digite 1 para dar play\nDigite 2 para dar pause");
        System.out.println("Digite 3 para dar stop\nDigite 4 para ir para próxima faixa");
        System.out.println("Digite 5 para voltar para voltar a faixa\nDigite 0 para sair do CD Player");
        System.out.println("====================");

        boolean continuar = true;
        while (continuar) {
            int seletor = sc.nextInt();
            switch (seletor) {
                case 1:
                    cdp1.play();
                    break;
            
                case 2:
                    cdp1.pause();
                    break;
            
                case 3:
                    cdp1.stop();
                    break;
            
                case 4:
                    cdp1.next();
                    break;
            
                case 5:
                    cdp1.previous();
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
    }
}

