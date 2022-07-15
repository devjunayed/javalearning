package daysix;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pi = 3.1416, radius;

        System.out.print("Enter Radius: ");
        radius = input.nextDouble();

        System.out.println("The Area of circle is: " + (pi*radius*radius));

    }
}
