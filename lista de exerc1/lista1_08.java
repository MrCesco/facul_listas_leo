import java.util.Scanner;

public class lista1_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite horas, minutos e segundos para calcular quantos segundos foram decorridos neste dia");
        System.out.println("Digite horas(não pode ser mais que 23 horas): ");
        int horas = sc.nextInt();

        //horas
        if (horas > 23) {
            System.out.println("Não pode ser mais que 23 horas!");
            return;
        } 

        //minutos
        System.out.println("Digite minutos(não pode ser mais que 60 minutos): ");
        int min = sc.nextInt();            
        
        if (min > 60) {
            System.out.println("Não pode ser mais que 60 minutos!");
            return;
        } 
        
        //segundos
        System.out.println("Digite minutos(não pode ser mais que 60 minutos): ");
        int segs = sc.nextInt();
        
        if (segs > 60) {
            System.out.println("Não pode ser mais que 60 segundos!");
            return;
        } 

        //resposta
        int totalSegundos = ((horas * 60 * 60) + (min * 60) + segs);

        System.out.printf("O total de segundos decorridos neste dia foram %d%n", totalSegundos);

        sc.close();
    }
}