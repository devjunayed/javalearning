package dayseven;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        /**
         * What is statement?
         * => Any meaningful expression is called a statement
         *          Example:
         *          ...............
         *          x = 10;
         *          System.out.println("Positive");
         *          System.out.println("Negative");
         *          System.out.println("Zero");
         */


        /**
         * Control Statement
         *     1. Selection
         *          i.   if
         *          ii.  if else
         *          iii. else
         *          iv.  switch
         *     2. Iteration/Loop
         *          i.   for
         *          ii.  while
         *          iii. do while
         *     3. Jump
         *          i.   break
         *          ii.  continue
         *          iii. return
         */


        //Positive demo

        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any integer: ");
        num = input.nextInt();

        if(num>0){
            System.out.println("Positive");
        }else if(num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }


    }
}
