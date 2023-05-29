package models;

public class Conta {
    private String numero;
    private String nomeTitular;
    private double saldo;
    
    public Conta(String numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositarDinheiro(double valor) {
        System.out.printf("Depósito de R$%.2f\n", valor);
        saldo += valor;
    }

    public void sacarDinheiro(double valor) {
        if(valor>saldo) {
            System.out.println("Você não tem saldo suficiente!");
        } else {
            setSaldo(-valor);
        }
    }

    @Override
    public String toString() {
        return "Conta " + numero + ", nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
    }
}