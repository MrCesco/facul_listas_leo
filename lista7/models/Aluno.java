package models;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double media() {
        double media = (getNota1() + getNota2())/2;
        return media;
    }

    public boolean aprovado() {
        if(media()>=7) {
            return true;
        } else {
            return false;
        }
    }

    public double quantoPrecisa() {
        double precisa = (50-media()*6)/4;
        return precisa;
    }
}
