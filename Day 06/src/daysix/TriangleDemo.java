package daysix;

import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height;

        System.out.print("Enter the base: ");
        base = input.nextDouble();

        System.out.print("Enter the height: ");
        height = input.nextDouble();

        System.out.println("The Aria of triangle is: " + (0.5 * base * height));


    }
}
