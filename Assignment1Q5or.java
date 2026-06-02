import java.util.Scanner;

public class Assignment1Q5or {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        sc.close();

        if (length <= 0 || width <= 0) {
            System.out.println("Length and width must be positive numbers.");
        } else {
            System.out.printf("%n--- Rectangle Results ---%nLength    : %.2f%nWidth     : %.2f%nArea      : %.2f square units%nPerimeter : %.2f units%n",
                length, width, length * width, 2 * (length + width));
        }
    }
}