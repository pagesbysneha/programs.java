// Assignment 1
//7. Write a Java Program to display whether a number is odd or even. 

import java.util.Scanner;

public class Assignment1Q7 {

    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = obj.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is an even number.");
        } else {
            System.out.println(n + " is an odd number.");
        }

        obj.close();
    }
}