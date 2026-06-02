import java.util.Scanner;

class Television {
    double price;
    double discount;
    double finalAmount;

    // Method to accept price
    void inputPrice(double p) {
        price = p;
    }

    // Method to calculate discount
    void calculateDiscount() {
        if (price >= 50000) {
            discount = price * 0.20; // 20% discount
        } else if (price >= 30000) {
            discount = price * 0.10; // 10% discount
        } else {
            discount = price * 0.05; // 5% discount
        }

        finalAmount = price - discount;
    }

    // Method to display details
    void display() {
        System.out.println("Television Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final Payable Amount: " + finalAmount);
    }
}

public class Home_Assignment1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Television tv = new Television();

        // Taking input from user
        System.out.print("Enter Television Price: ");
        double price = sc.nextDouble();

        // Calling methods
        tv.inputPrice(price);
        tv.calculateDiscount();
        tv.display();

        sc.close();
    }
}
