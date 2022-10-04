import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("Qual e a temperatura em Fahrenheit: ");
        fahrenheit = entrada.nextDouble();
        celsius = 5 * ((fahrenheit-32) / 9);

        System.out.println("A temperatura em Celsius e: "+ celsius);
    }
}
