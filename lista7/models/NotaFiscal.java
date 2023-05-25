package models;

public class NotaFiscal {
    private ItemNotaFiscal item1 = new ItemNotaFiscal();
    private ItemNotaFiscal item2 = new ItemNotaFiscal();
    private ItemNotaFiscal item3 = new ItemNotaFiscal();

    public ItemNotaFiscal getItem1() {
        return item1;
    }

    public void setItem1(ItemNotaFiscal item1) {
        this.item1 = item1;
    }

    public ItemNotaFiscal getItem2() {
        return item2;
    }

    public void setItem2(ItemNotaFiscal item2) {
        this.item2 = item2;
    }

    public ItemNotaFiscal getItem3() {
        return item3;
    }

    public void setItem3(ItemNotaFiscal item3) {
        this.item3 = item3;
    }

    public double calculaTotalNota() {
        double num1 = item1.calculaValorICMS();
        double num2 = item2.calculaValorICMS();
        double num3 = item3.calculaValorICMS();
        return num1 + num2 + num3;
    }

    public void mostrarNota() {
        item1.mostrarItem(1);
        item2.mostrarItem(2);
        item3.mostrarItem(3);
    }
}
