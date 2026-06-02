// Assignment 1
//12. Write a Java program to check whether a year is leap year or not.

import java.util.Scanner;

public class Assignment1Q12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = obj.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + (isLeap ? " is a Leap Year." : " is NOT a Leap Year."));
        obj.close();
    }
}