package week_2_programmes;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string :");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUpperCaseToLowerCase(uppercase);
        //closing scanner
        scanner.close();
    }

    //conversion of uppercase to lowercase method
    public void convertUpperCaseToLowerCase(String text) {
        System.out.println("The lowercase value is : " + text.toLowerCase());
    }
}
