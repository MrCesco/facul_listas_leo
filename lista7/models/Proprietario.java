package models;

public class Proprietario {
    private String nome;
    private String endereco;
    private String sexo;
    private int cpf;
    private int cnh;

    public Proprietario(String nome, String endereco, String sexo, int cpf, int cnh) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cpf = cpf;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "Proprietario: " + nome + ", Endereço: " + endereco + ", Sexo: " + sexo + ", Cpf: " + cpf + ", Cnh: "
                + cnh;
    }
    
}
