package models;

public class ContaCorrente extends Conta {
    private double limite = 500;

    public ContaCorrente(String numero, String nomeTitular, double saldo, double limite) {
        super(numero, nomeTitular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacarDinheiro(double valor) {
        System.out.printf("Saque de R$%.2f\n", valor);
        if(valor>getSaldo()+limite) {
            System.out.println("Você não tem saldo suficiente!");
        } else {
            double saldo = getSaldo();
            saldo -= valor;
            setSaldo(saldo);
        }
    }

    @Override
    public String toString() {
        return "Conta: " + getNumero() + ", Nome do titular: " + getNomeTitular() + ", Saldo: " + getSaldo() + ", Limite: " + limite;
    }    
}
