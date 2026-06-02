import java.util.Scanner;
public class Fibonacci {

    // Recursive function
    public static int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static void fibIterative(int n) {
        int a = 0, b = 1, next;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.println("\nFibonacci (Non-Recursive):");
        fibIterative(n);
        System.out.println("\n\nFibonacci (Recursive):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRecursive(i) + " ");
        }
        sc.close();
    }
}






