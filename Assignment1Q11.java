// Assignment 1
//11. Write a Java program to convert miles to kilometers. 

import java.util.Scanner;

public class Assignment1Q11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter distance in Miles: ");
        double miles = obj.nextDouble();

        if (miles < 0) {
            System.out.println("Distance cannot be negative.");
        } else {
            double kilometers = miles * 1.60934;

            System.out.printf("Miles      : %.2f mi%n",  miles);
            System.out.printf("Kilometers : %.2f km%n",  kilometers);
        }

        obj.close();
    }
}