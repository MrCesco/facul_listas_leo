package models;
import java.text.DecimalFormat;
import java.util.*;

public class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<Moeda>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
        System.out.printf("Adicionando R$ %.2f no cofrinho...\n", moeda.getValor());
    }

    public void excluirMoeda(Moeda moeda) {
        System.out.printf("Removendo R$ %.2f do cofrinho...\n", moeda.getValor());
        if(this.calcularTotal(moedas) < moeda.getValor()) {
            System.out.println("Impossivel remover moeda. Valor insuficiente...");
        } else {
            moedas.remove(moeda);
        }
    }

    public int getQuantidadeMoeda() {
        return moedas.size();
    }

    public Moeda getMoeda(int index) {
        return moedas.get(index - 1);
    }

    public double calcularTotal(ArrayList meodas) {
        double somador = 0;
        for (int i = 0; i < meodas.size(); i++) {
            somador += moedas.get(i).getValor();
        }
        return somador;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        if(calcularTotal(moedas) == 0) {
            return "Cofre vazio!";
        } else {
            return "Total: R$ "+df.format(calcularTotal(moedas));
        }
    }    
}
