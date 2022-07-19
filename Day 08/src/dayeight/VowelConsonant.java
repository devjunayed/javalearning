package dayeight;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char s;
        boolean ch1, ch2;
        System.out.print("Enter any letter: ");
        s = input.next().charAt(0);

        ch1 = (s == 'a'|| s == 'e' || s == 'i' || s == 'o' || s == 'u' );
        ch2 = (s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U');

        if(ch1 || ch2){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }

    }
}
