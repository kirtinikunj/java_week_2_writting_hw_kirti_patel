package week_2_programmes;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of traiangle :");
        int length = scanner.nextInt();
        System.out.println("Enter the height of triangle :");
        int height = scanner.nextInt();
        areaOfTriangle(length, height);
        //closing scanner
        scanner.close();
    }

    //Calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int length, int height) {
        int area = (length * height) / 2;
        System.out.println("The area of a triangle is : " + area);
    }
}
