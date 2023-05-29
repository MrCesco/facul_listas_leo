package execs;
import models.ContaCorrente;

public class exerc2 {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("Conta 01", "Francesco", 1000, 500);
        System.out.println(cc1);
        cc1.depositarDinheiro(100);
        System.out.println(cc1);
        cc1.sacarDinheiro(1000);
        System.out.println(cc1);
        cc1.sacarDinheiro(750);
        System.out.println(cc1);
        cc1.sacarDinheiro(350);
        System.out.println(cc1);
        cc1.sacarDinheiro(100);
        System.out.println(cc1);
        cc1.sacarDinheiro(150);
        System.out.println(cc1);
        cc1.sacarDinheiro(50);
        System.out.println(cc1);
        cc1.depositarDinheiro(100);
        System.out.println(cc1);
    }
}
