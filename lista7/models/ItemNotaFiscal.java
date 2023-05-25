package models;

public class ItemNotaFiscal {
    private String descricao;
    private double precoUnitario;
    private int quantidade;
    private double aliquotaICMS;
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getaliquotaICMS() {
        return aliquotaICMS;
    }

    public void setaliquotaICMS(double aliquotaICMS) {
        this.aliquotaICMS = aliquotaICMS;
    }

    @Override
    public String toString() {
        return "ItemNotaFiscal [descricao=" + descricao + ", precoUnitario=" + precoUnitario + ", quantidade="
                + quantidade + ", aliquotaICMS=" + aliquotaICMS + "]";
    }

    public double calculaValorItens() {
        return quantidade*precoUnitario;
    }

    public double calculaValorICMS() {
        return calculaValorItens() * aliquotaICMS;
    }

    public void mostrarItem(int numeroItem) {
        System.out.println("Item " + numeroItem + "\nDescrição: " + descricao + "\nPreço Unit.: R$ " + precoUnitario +
                "\nQuantidade: " + quantidade + "\n ICMS: " + aliquotaICMS + "\n Valor total: R$ " +
                calculaValorItens() + " Valor ICMS: R$ " + calculaValorICMS());
    }
    
}
