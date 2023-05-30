package execs;
import models.Moeda;
import models.Cofrinho;

public class exerc4 {
    public static void main(String[] args) {
        Moeda umCentavo = new Moeda(0.01, "Um centavo");
        Moeda cincoCentavos = new Moeda(0.05, "Cinco centavos");
        Moeda dezCentavos = new Moeda(0.10, "Dez centavos");
        Moeda vinteECincoCentavos = new Moeda(0.25, "Vinte e cinco centavos");
        Moeda cinquentaCentavos = new Moeda(0.50, "Cinquenta centavos");
        Moeda umReal = new Moeda(1, "Um real");
        
        Cofrinho cofrinho = new Cofrinho();
        System.out.println(cofrinho);
        cofrinho.adicionarMoeda(umCentavo);
        System.out.println(cofrinho);
        cofrinho.adicionarMoeda(cincoCentavos);
        System.out.println(cofrinho);
        cofrinho.adicionarMoeda(dezCentavos);
        System.out.println(cofrinho);
        cofrinho.adicionarMoeda(vinteECincoCentavos);
        System.out.println(cofrinho);
        cofrinho.adicionarMoeda(cinquentaCentavos);
        System.out.println(cofrinho);
        cofrinho.adicionarMoeda(umReal);
        System.out.println(cofrinho);
        cofrinho.adicionarMoeda(umReal);
        System.out.println(cofrinho);
        cofrinho.excluirMoeda(umReal);
        System.out.println(cofrinho);
        cofrinho.excluirMoeda(umReal);
        System.out.println(cofrinho);
        cofrinho.excluirMoeda(cincoCentavos);
        System.out.println(cofrinho);
        cofrinho.excluirMoeda(umReal);
        System.out.println(cofrinho);
    }
}
