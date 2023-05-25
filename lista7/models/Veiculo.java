package models;

public class Veiculo {
    private int numeroPlaca;
    private String cor;
    private String modelo;
    private Proprietario proprietario;
    
    public Veiculo(int numeroPlaca, String cor, String modelo, Proprietario proprietario) {
        this.numeroPlaca = numeroPlaca;
        this.cor = cor;
        this.modelo = modelo;
        this.proprietario = proprietario;
    }

    public int getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(int numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Número da placa: " + numeroPlaca + ", Cor: " + cor + ", Modelo: " + modelo + "," + proprietario;
    }
    
}
