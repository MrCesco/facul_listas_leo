public class ExeVetor04 {
    public static void main(String[] args) {

        int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int cont = 0;

        for(int i = 0; i < 20; i++) {
            if(vetor[i]%2==0) {
                System.out.println("indice "+i+" - "+vetor[i]);
                cont++;
            }
        }

        System.out.printf("Tem %d numeros pares no vetor.", cont);
    }
}