package dayseven;

import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args) {


        /**
         * Unary Operator=============Meaning
         *      +                   Unary plus
         *      -                   Unary Minus
         *      ++                  Increment
         *      --                  Decrement
         */

        Scanner input = new Scanner(System.in);
        int x = 10, result;

        result = +x;
        System.out.println(result);

        result = -x;
        System.out.println(result);

        x++;//post increment
        --x;//pre dec
        x--;
        result = ++x;
        System.out.println(result);



    }
}
