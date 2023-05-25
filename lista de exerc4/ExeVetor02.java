public class ExeVetor02 {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        int cont = 10;

        for(int i = 0; i < 10; i++) {
            vetor[i] += cont;
            System.out.println(vetor[i]);
            cont += 10;
        }
    }
}