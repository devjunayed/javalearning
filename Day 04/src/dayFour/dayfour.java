package dayFour;

//we nead to import this after package to use Scanner class
import java.util.Scanner;

public class dayfour {
    public static void main(String[] args) {

        //user input
        Scanner input = new Scanner(System.in);//Scanner class variable

        int age;
        String name;
        double num;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.println("So, " + name + " you are " + age + " years old!");

        System.out.print("Enter your lucky double number:");
        num = input.nextDouble();
        System.out.println("Your lucky double number is: " + num);

        //format specifier
        boolean b = true;
        char c = 'a';
        short s = 32677;
        int i = 126587;
        float f = 10.2f;
        double d = 10.2f;

        // to use format specifier we have to use printf function
        System.out.printf("boolean b = %b\n", b);
        System.out.printf("Character c = %c\n", c);
        System.out.printf("Short s =  %d\n", s);
        System.out.printf("Integer i = %d\n", i);
        System.out.printf("Float f = %f\n", f);
        System.out.printf("Double d = %.2f\n", d);

    }
}
