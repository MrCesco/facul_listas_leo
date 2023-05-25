import java.util.Scanner;

public class ExeSelecao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Lista de Produtos e preços -----%n");
        System.out.println("1. Banana -> R$ 0.30 preço granel ou R$ 0.25 preço 12 ou mais");
        System.out.println("2. Laranja -> R$ 0.40 preço granel ou R$ 0.35 preço 12 ou mais");
        System.out.println("3. Maçã -> R$ 0.50 preço granel ou R$ 0.45 preço 12 ou mais");
        System.out.println("4. Kiwi -> R$ 0.40 preço granel ou R$ 0.30 preço 12 ou mais");

        System.out.println("Escolha o produto desejado ou digite -1 para sair: ");
        int fruta = sc.nextInt();

        switch (fruta) {
            case 1:
                System.out.println("Entre com o numero de bananas a serem compradas: ");
                int bananas = sc.nextInt();
        
                double bananaValor = 0, bananaValorF;
        
                if(bananas >= 12) {
                    bananaValor = 0.25;
                } else if (bananas > 0 && bananas < 12) {
                    bananaValor = 0.30;
                } else if (bananas <= 0) {
                    System.out.println("Nenhum item está sendo comprado");
                    break;
                }
        
                bananaValorF = bananas * bananaValor;        
        
                System.out.println("--- Valor da compra ---");
                System.out.printf("%d unidade(s) de bananas a R$ %.2f a unidade = R$ = %.2f", bananas, bananaValor, bananaValorF);
                
                break;
            case 2:
                System.out.println("Entre com o numero de laranjas a serem compradas: ");
                int laranjas = sc.nextInt();
        
                double laranjaValor = 0, laranjaValorF;
        
                if(laranjas >= 12) {
                    laranjaValor = 0.35;
                } else if (laranjas > 0 && laranjas < 12) {
                    laranjaValor = 0.40;
                } else if (laranjas <= 0) {
                    System.out.println("Nenhum item está sendo comprado");
                    break;
                }
        
                laranjaValorF = laranjas * laranjaValor;        
        
                System.out.println("--- Valor da compra ---");
                System.out.printf("%d unidade(s) de laranjas a R$ %.2f a unidade = R$ = %.2f", laranjas, laranjaValor, laranjaValorF);

                break;
            case 3:
                System.out.println("Entre com o numero de maçãs a serem compradas: ");
                int macas = sc.nextInt();
        
                double macaValor = 0, macaValorF;
        
                if(macas >= 12) {
                    macaValor = 0.45;
                } else if (macas > 0 && macas < 12) {
                    macaValor = 0.50;
                } else if (macas <= 0) {
                    System.out.println("Nenhum item está sendo comprado");
                    break;
                }
        
                macaValorF = macas * macaValor;        
        
                System.out.println("--- Valor da compra ---");
                System.out.printf("%d unidade(s) de maçãs a R$ %.2f a unidade = R$ = %.2f", macas, macaValor, macaValorF);

                break;
            case 4:
                System.out.println("Entre com o numero de kiwi a serem compradas: ");
                int kiwi = sc.nextInt();
        
                double kiwiValor = 0, kiwiValorF;
        
                if(kiwi >= 12) {
                    kiwiValor = 0.30;
                } else if (kiwi > 0 && kiwi < 12) {
                    kiwiValor = 0.40;
                } else if (kiwi <= 0) {
                    System.out.println("Nenhum item está sendo comprado");
                    break;
                }
        
                kiwiValorF = kiwi * kiwiValor;        
        
                System.out.println("--- Valor da compra ---");
                System.out.printf("%d unidade(s) de kiwis a R$ %.2f a unidade = R$ = %.2f", kiwi, kiwiValor, kiwiValorF);

                break;
            case -1:
              System.out.println("Você escolheu sair");
              break;
        }

        sc.close();
    }
}

