package execs;
import models.*;

public class exerc1 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Francesco", 123, 3500);
        Funcionario func2 = new Funcionario("João", 030, 3500);
        Gerente geren1 = new Gerente("Leonardo", 321, 3500, "Profs");

        System.out.println(func1);
        System.out.println(func2);
        System.out.println(geren1);

    }
}