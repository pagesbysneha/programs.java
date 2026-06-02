import java.util.Scanner;

public class Factorial {

    public static int factRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factRecursive(n - 1);
    }

    public static int factIterative(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial (Non-Recursive): " + factIterative(n));

        System.out.println("Factorial (Recursive): " + factRecursive(n));
        sc.close();
    }
}



