package models;

public class FuncionarioCLT extends CFuncionario {
    private double salarioMensal;

    public FuncionarioCLT(String nome, String cpf, double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }
    
    @Override
    public void calculaRendimentos() {
        System.out.printf("Rendimento mensal %.2f\n", salarioMensal);
    } 
}
