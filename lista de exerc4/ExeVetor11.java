import java.util.Arrays;

public class ExeVetor11 {
    public static void main(String[] args) {
        int[] vetor = new int[20];
        
        for (int i = 0; i < 20; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
        
        System.out.println("Vetor antes da ordenação: " + Arrays.toString(vetor));
        
        Arrays.sort(vetor);
        
        System.out.println("Vetor depois da ordenação: " + Arrays.toString(vetor));
    }
}
