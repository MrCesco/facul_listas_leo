import java.util.Scanner;

public class lista1_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Converta Temperatura de Fahrenheit em Celsius, digite a temperatura em Fahrenheit: ");
        float tempFahrenheit = sc.nextFloat();

        float tempCelsius = ((tempFahrenheit-32)*5/9);
        System.out.printf("A temperatura em Celsius fica: %.2f%n", tempCelsius);

        sc.close();
    }
}