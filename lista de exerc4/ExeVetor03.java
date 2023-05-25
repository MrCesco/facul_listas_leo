public class ExeVetor03 {
    public static void main(String[] args) {

        int[] vetorB = new int[10];

        for(int i = 0; i < vetorB.length; i++) {
            if (i%2==0) {
                vetorB[i] = 20;
            } else {
                vetorB[i] = 10;
            }
            System.out.println(i + " " + vetorB[i]);
        }

    }
}