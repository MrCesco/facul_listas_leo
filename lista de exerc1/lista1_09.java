import java.util.Scanner;

public class lista1_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos homens vão na festa?");
        int homem = sc.nextInt();

        System.out.println("Quantas mulheres vão na festa?");
        int mulher = sc.nextInt();
        
        System.out.println("Quantas crianças vão na festa?");
        int cria = sc.nextInt();

        int carneMG = (homem*650)+(mulher*420)+(cria*290);
        int carneKG = (carneMG/1000);
        System.out.printf("Será preciso de %d gramas de carne, pra ficar mais fácil pro acogueiro, pede %d kg", carneMG, carneKG);

        sc.close();
    }
}