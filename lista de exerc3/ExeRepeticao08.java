import java.util.Scanner;

public class ExeRepeticao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade;
        int contHomens = 0;
        int somaIdadeHomens = 0;
        int contMulheres = 0;
        int somaIdadeMulheres = 0;
        
        while (true) {
            System.out.print("Digite o sexo (M ou F) ou digite qualquer outra tecla para sair: ");
            String sexo = sc.nextLine();
            
            if (sexo.equalsIgnoreCase("M")) {
                System.out.print("Digite a idade: ");
                idade = sc.nextInt();
                sc.nextLine();
                
                contHomens++;
                somaIdadeHomens += idade;
            } else if (sexo.equalsIgnoreCase("F")) {
                System.out.print("Digite a idade: ");
                idade = sc.nextInt();
                sc.nextLine();
                
                contMulheres++;
                somaIdadeMulheres += idade;
            } else {
                break;
            }
        }

        int resultM = somaIdadeHomens / contHomens;
        int resultF = somaIdadeMulheres / contMulheres;

        System.out.println("A média de idade dos homens é: "+resultM);
        System.out.println("A média de idade das mulheres é: "+resultF);

        sc.close();
    }
}