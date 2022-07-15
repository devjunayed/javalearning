package DayFive;

import java.util.Scanner;

public class dayfive {
    public static void main(String[] args) {
        //Arithmetic Operator
        /**
         * a + b = 7; //Here, a, b is operand and +, = is operator where 7 is consonant
         * There are  Fiver operator in Java
         * 1. + (Addition)
         * 2. - (Subtraction)
         * 3. * (Multiplication)
         * 4. / (Division)
         * 5. % (Modulus)
         */

//        Scanner input = new Scanner(System.in);
//        int num1, num2;
//
//        System.out.print("Enter num1: ");
//        num1 = input.nextInt();
//
//        System.out.print("Enter num2: ");
//        num2 = input.nextInt();
//
//        System.out.println("Summation of two numbers: " + (num1+num2));
//        System.out.println("Subtraction of two numbers: " + (num1-num2));
//        System.out.println("Multiplication of two numbers: " + (num1*num2));
//        System.out.println("Division of two numbers: " + (num1/num2));
//        System.out.println("Modulus of two numbers: " + (num1%num2));





            //Assignment Operator
        /**
         *  1. =    ex. y = x + 5;
         *  2. +=   ex. y += 5;           x = x + 5;
         *  3. -=   ex. x -= y;           x = x - y;
         *  4. *=   ex. x *= y;           x = x * y;
         *  5. /=   ex. x /= y;           x = x / y;
         *  6. %=   ex. x %= y;           x = x % y;
         */



        int x = 3;
        int y = 2;

        x+=y;//5
        System.out.println(x);
        x-=y;//3
        System.out.println(x);
        x*=y;//6
        System.out.println(x);
        x/=y;//3
        System.out.println(x);
        x%=y;//1
        System.out.println(x);






    }
}
