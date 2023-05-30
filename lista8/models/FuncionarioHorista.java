package models;

public class FuncionarioHorista extends CFuncionario {
    private double salarioHora;
    private int horasTrabalhas;
    
    public FuncionarioHorista(String nome, String cpf, double salarioHora, int horasTrabalhas) {
        super(nome, cpf);
        this.salarioHora = salarioHora;
        this.horasTrabalhas = horasTrabalhas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhas() {
        return horasTrabalhas;
    }

    public void setHorasTrabalhas(int horasTrabalhas) {
        this.horasTrabalhas = horasTrabalhas;
    }

    @Override
    public void calculaRendimentos() {
        double salarioFinal;
        salarioFinal = salarioHora * horasTrabalhas;
        System.out.printf("Rendimento mensal: %.2f\n", salarioFinal);
    } 
}
