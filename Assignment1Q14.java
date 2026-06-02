// Assignment 1
//14. Write a Java program to check whether a number is divisible by 5 or not. 

import java.util.Scanner;

public class Assignment1Q14 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = obj.nextInt();

        if (n % 5 == 0) {
            System.out.println(n + " is Divisible by 5.");
        } else {
            System.out.println(n + " is NOT Divisible by 5.");
        }

        obj.close();
    }
}