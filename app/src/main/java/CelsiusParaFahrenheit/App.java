package CelsiusParaFahrenheit;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        float celsius = 0;
        float fahrenheit = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Temperatura em Celsius: ");
        celsius = leitor.nextFloat();
        

        fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("Celsius para fahrenheit: " + fahrenheit);

    }
}
