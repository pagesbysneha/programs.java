// Assignment 1
//4. Write a Java program to change temperature from Fahrenheit to Celsius. 

import java.util.Scanner;

public class Assignment1Q4 {

    public static double convert(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = obj.nextDouble();

        double celsius = convert(fahrenheit);

        System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);

        obj.close();
    }
}

