package models;

public class Quadrado {

    private int ladoQuadrado;
    
    public Quadrado(int ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
    }

    public int getLadoQuadrado() {
        return ladoQuadrado;
    }

    public void setLadoQuadrado(int ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
    }

    public int areaQuadrado() {
        int area = getLadoQuadrado()*getLadoQuadrado();
        return area;
    }

    public int perimetroQuadrado() {
        int perimetro = getLadoQuadrado()*4;
        return perimetro;
    }

    public double diagonalQuadrado() {
        return (double)Math.sqrt(2) * getLadoQuadrado();
    }

    @Override
    public String toString() {
        return "Quadrado [ladoQuadrado=" + ladoQuadrado + "]";
    }
}
