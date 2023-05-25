public class ExeRepeticao06 {
    public static void main(String[] args) {
        int numero = 101;
        int contador = 0;
        
        while (contador < 50) {
            int divisores = 0;
            
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores++;
                }
            }
            
            if (divisores == 2) {
                System.out.println(numero);
                contador++;
            }
            
            numero++;
        }
    }
}
