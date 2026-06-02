// Assignment 1
//6. Write a Java program to find area and perimeter of a circle. 

import java.util.Scanner;

public class Assignment1Q6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = obj.nextDouble();
        System.out.printf("Area          : %.2f sq units%n", Math.PI * r * r);
        System.out.printf("Circumference : %.2f units%n", 2 * Math.PI * r);
        obj.close();
    }
}