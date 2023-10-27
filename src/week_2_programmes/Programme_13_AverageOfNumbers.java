package week_2_programmes;

import java.util.Scanner;

/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */
public class Programme_13_AverageOfNumbers {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        double x = scanner.nextDouble();
        System.out.println("Enter second number :");
        double y = scanner.nextDouble();
        System.out.println("Enter third number :");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x, y, z);
        //closing scanner
        scanner.close();
    }

    //calculation of average of three numbers
    public static void averageOfThreeNumbers(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.println("The average of " + a + "," + b + "," + c + " = " + average);
    }
}
