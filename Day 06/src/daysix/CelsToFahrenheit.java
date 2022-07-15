package daysix;

import java.util.Scanner;

public class CelsToFahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double cels, result;

        System.out.print("Enter your temparature in cels: ");
        cels = input.nextDouble();

        result = (cels * 1.8) + 32;

        System.out.print("Celsius to Fahrenheit is: ");
        System.out.printf("%f", result);

    }
}
