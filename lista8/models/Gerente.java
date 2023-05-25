package models;

import java.text.DecimalFormat;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int cpf, double salario, String departamento) {
        super(nome, cpf, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }   

    @Override
    public double getSalario() {
        double salario = super.getSalario();
        salario += salario*0.2f;
        return salario;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Genrente: " + getNome() + ", CPF: " + getCpf() + ", Salario: "+ df.format(getSalario()) +" Departamento: " + departamento;
    }
}
