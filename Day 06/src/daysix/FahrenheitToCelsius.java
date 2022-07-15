package daysix;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fah, result;

        System.out.print("Enter your value in Fahrenheit: ");
        fah = input.nextDouble();

        result = 0.56 *(fah-32);
        System.out.println("Celsius: " + result);

    }
}
