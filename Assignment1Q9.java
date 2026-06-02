// Assignment 1
//9. Write a Java program to find maximum of three numbers. 

import java.util.Scanner;

public class Assignment1Q9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double a = obj.nextDouble();
        System.out.print("Enter second number: ");
        double b = obj.nextDouble();
        System.out.print("Enter third number : ");
        double c = obj.nextDouble();

        double max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("\nMaximum number is: " + max);

        obj.close();
    }
}