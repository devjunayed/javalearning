package daytwo;

public class daytwo {
    public static void main(String [] args){
        //First program
        System.out.println("Hello Wordl!");


        /**=============Variable============
         * => Rules of variable
         * 1. Variable name can have (A...Z, a...z), (0,1,...,9),underscore(_)
         * and doller ($) sign
         *
         * 2. Variable name can't start with digit
         *
         * 3. Can't use any keyword, funcation name as a variable
         *
         * 4. Variable name can't have any space between it.
         *
         * 5. Variable name can have 31 character but 8 character is recomended.
         *
         *
         * =>valid variable:
         * 1. role_number, Id1, subject102, $anis
         * 2. number1, _number1, a2b
         * 3. Float, MAIN
         * 4. my_1st_variable
         *
         *
         * =>Invalid variable:
         * 1. "Anis", anis@, #anis
         * 2. 1number, 96times
         * 3. float, main, for
         * 4. my 1st variable, number 1
         *
         *
         * =>Variable declaration Syntax
         *      data_type variable_name;
         */


        /**================= Data type in Java =================
         * =>Data Type
         *      1. Primitive
         *             A. Boolean
         *                  a). boolean
         *             B. Numeric
         *                  a). Character
         *                         I). char
         *                  b). Integral
         *                         I). Integer
         *                              i).   byte
         *                              ii).  short
         *                              iii). int
         *                              iv).  long
         *                         II). Floating-point
         *                              i).  float
         *                              ii). double
         *      2. Non-Primitive
         *          A. String
         *          B. Array
         *          C. etc.
         */

        //Example of data type and variable
        int num1 = 10, num2 = 20;
        int sum = num1 + num2;
        System.out.println("Sum of two number is: " + sum);


    }
}
