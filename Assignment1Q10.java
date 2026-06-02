// Assignment 1
// 10. Write a Java program to swap two numbers. 

import java.util.Scanner;

public class Assignment1Q10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double a = obj.nextDouble();
        System.out.print("Enter second number: ");
        double b = obj.nextDouble();

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swap using temp variable
        double temp = a; a = b; b = temp;

        System.out.println("After Swap : a = " + a + ", b = " + b);

        obj.close();
    }
}