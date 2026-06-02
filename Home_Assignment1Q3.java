import java.util.Scanner;
public class Home_Assignment1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Removing vowels
        String result = str.replaceAll("[AEIOUaeiou]", "");

        // Displaying result
        System.out.println("String after removing vowels: " + result);

        sc.close();
    }
}

