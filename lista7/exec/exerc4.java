package exec;
import models.*;

public class exerc4 {
    public static void main(String[] args) {
        Proprietario prop1 = new Proprietario("Francesco", "Rua Tal 123", "Masculino", 1234, 112233);
        Proprietario prop2 = new Proprietario("Luiza", "Rua Tal 321", "Feminino", 4321, 332211);

        Veiculo car1 = new Veiculo(1, "Prata", "Cronos", prop1);
        Veiculo car2 = new Veiculo(2, "Rosa", "Civic", prop1);
        Veiculo car3 = new Veiculo(3, "Vermelho", "Corolla", prop1);
        Veiculo car4 = new Veiculo(4, "Branco", "Renegade", prop2);
        Veiculo car5 = new Veiculo(5, "Azul", "City", prop2);

        System.out.println("Mostrando veiculo 1= "+car1);
        System.out.println("Mostrando veiculo 2= "+car2);
        System.out.println("Mostrando veiculo 3= "+car3);
        System.out.println("Mostrando veiculo 4= "+car4);
        System.out.println("Mostrando veiculo 5= "+car5);

    }    
}
