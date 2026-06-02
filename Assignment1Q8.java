// Assignment 1
//8. Write a Java Program to check if a number is Positive or Negative. 

import java.util.Scanner;

public class Assignment1Q8 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = obj.nextDouble();

        if (n > 0) {
            System.out.println(n + " is a Positive number.");
        } else if (n < 0) {
            System.out.println(n + " is a Negative number.");
        } else {
            System.out.println("The number is Zero.");
        }

        obj.close();
    }
}
