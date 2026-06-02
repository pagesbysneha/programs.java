import java.util.Scanner;

class Commission {
    String name;
    double sales;
    double commission;

    // Method to accept details
    void input(String n, double s) {
        name = n;
        sales = s;
    }

    // Method to calculate commission
    void calculateCommission() {
        if (sales >= 50000) {
            commission = sales * 0.15; // 15% commission
        } else if (sales >= 30000) {
            commission = sales * 0.10; // 10% commission
        } else {
            commission = sales * 0.05; // 5% commission
        }
    }

    // Method to display details
    void display() {
        System.out.println("Salesperson Name: " + name);
        System.out.println("Sales Amount: " + sales);
        System.out.println("Commission: " + commission);
        System.out.println();
    }
}

public class Home_Assignment1Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of salespersons
        System.out.print("Enter number of salespersons: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Creating array of objects
        Commission[] sp = new Commission[n];

        // Input and processing
        for (int i = 0; i < n; i++) {
            sp[i] = new Commission();

            System.out.println("\nEnter details for Salesperson " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Sales Amount: ");
            double sales = sc.nextDouble();
            sc.nextLine();

            sp[i].input(name, sales);
            sp[i].calculateCommission();
        }

        // Displaying details
        System.out.println("\n--- Salesperson Details ---");

        for (int i = 0; i < n; i++) {
            sp[i].display();
        }

        sc.close();
    }
}