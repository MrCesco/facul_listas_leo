package exec;
import models.*;

public class exerc1 {
    public static void main(String[] args) {

        Quadrado quad1 = new Quadrado(10);

        System.out.println(quad1);

        System.out.println("A área do quadrado é: "+quad1.areaQuadrado());

        System.out.println("O perimetro do quadrado é: "+quad1.perimetroQuadrado());

        System.out.printf("A diagonal do quadrado é: %.2f%n", quad1.diagonalQuadrado());
    }
}