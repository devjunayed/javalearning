package dayeight;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter any numbers: ");
        num = input.nextInt();

        if(num%2 == 0){
            System.out.printf("%d is a Even number!", num);
        } else{
            System.out.printf("%d is an Odd number!", num);
        }


    }
}
