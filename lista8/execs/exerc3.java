package execs;
import models.FuncionarioCLT;
import models.FuncionarioHorista;

public class exerc3 {
    public static void main(String[] args) {
        FuncionarioCLT fClt1 = new FuncionarioCLT("Joãozinho", "1234", 3500); 
        FuncionarioHorista fHorista1 = new FuncionarioHorista("Ciclano", "4321", 75, 60);

        System.out.println("Dados Funcionario CLT:");
        System.out.println("Nome: "+fClt1.getNome());
        System.out.println("CPF: "+fClt1.getCpf());
        fClt1.calculaRendimentos();

        System.out.println("Dados Funcionario Horista:");
        System.out.println("Nome: "+fHorista1.getNome());
        System.out.println("CPF: "+fHorista1.getCpf());
        fHorista1.calculaRendimentos();
    }
}
