// Assignment 1
//5. Write a Java program to find area and perimeter of a rectangle. 

import java.util.Scanner;

public class Assignment1Q5 {

    // Method to calculate Area
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate Perimeter
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        // Validate input
        if (length <= 0 || width <= 0) {
            System.out.println("Length and width must be positive numbers.");
        } else {
            double area      = calculateArea(length, width);
            double perimeter = calculatePerimeter(length, width);

            System.out.println("\n--- Rectangle Results ---");
            System.out.printf("Length    : %.2f%n", length);
            System.out.printf("Width     : %.2f%n", width);
            System.out.printf("Area      : %.2f square units%n", area);
            System.out.printf("Perimeter : %.2f units%n", perimeter);
        }

        sc.close();
    }
}