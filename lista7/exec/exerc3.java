package exec;
import models.*;
import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        
        Aluno aluno1 = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno1.setNome(sc.nextLine());

        System.out.println("Digite o número da matricula: ");
        aluno1.setMatricula(sc.nextInt());
        
        System.out.println("Digite a nota 1: ");
        aluno1.setNota1(sc.nextDouble());

        System.out.println("Digite a nota 2: ");
        aluno1.setNota2(sc.nextDouble());

        System.out.printf("A média do aluno é: %.2f%n", aluno1.media());

        if(aluno1.aprovado()) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.printf("Aluno reprovado, precisará tirar %.2f no exame de recuperação.%n", aluno1.quantoPrecisa());
        }

        sc.close();
    }
}
