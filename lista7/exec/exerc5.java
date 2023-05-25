package exec;
import models.*;

public class exerc5 {
    public static void main(String[] args) {

        ItemNotaFiscal item1 = new ItemNotaFiscal();
        item1.setDescricao("Batata");
        item1.setPrecoUnitario(0.50);
        item1.setQuantidade(10);
        item1.setaliquotaICMS(0.15);

        ItemNotaFiscal item2 = new ItemNotaFiscal();
        item2.setDescricao("Cenoura");
        item2.setPrecoUnitario(0.25);
        item2.setQuantidade(6);
        item2.setaliquotaICMS(0.12);

        ItemNotaFiscal item3 = new ItemNotaFiscal();
        item3.setDescricao("Banana");
        item3.setPrecoUnitario(0.75);
        item3.setQuantidade(8);
        item3.setaliquotaICMS(0.09);

        NotaFiscal n1 = new NotaFiscal();
        n1.setItem1(item1);
        n1.setItem2(item2);
        n1.setItem3(item3);
        
        n1.mostrarNota();
    }
}
