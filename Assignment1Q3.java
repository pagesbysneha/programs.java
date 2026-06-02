// Assignment 1
//3. Write a Java program to change temperature from Celsius to Fahrenheit.

import java.util.Scanner;
public class Assignment1Q3 {
    
    public static double convert(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = obj.nextDouble();

        double fahrenheit = convert(celsius);

        System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);

        obj.close();
    }
}

