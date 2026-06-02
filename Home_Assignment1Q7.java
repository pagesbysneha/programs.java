import java.util.Scanner;

// Abstract class
abstract class Accounts {
    double balance;

    // Constructor
    Accounts(double b) {
        balance = b;
    }

    // Abstract methods
    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    // Method to display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// SavingsAccount subclass
class SavingsAccount extends Accounts {

    SavingsAccount(double b) {
        super(b);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited in Savings Account: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn from Savings Account: " + amount);
        } else {
            System.out.println("Insufficient Balance in Savings Account.");
        }
    }
}

// CurrentAccount subclass
class CurrentAccount extends Accounts {

    CurrentAccount(double b) {
        super(b);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited in Current Account: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance + 5000) { // Overdraft limit
            balance -= amount;
            System.out.println("Amount Withdrawn from Current Account: " + amount);
        } else {
            System.out.println("Overdraft Limit Exceeded.");
        }
    }
}

// Main class
public class Home_Assignment1Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Savings Account
        System.out.print("Enter initial balance for Savings Account: ");
        double sbalance = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(sbalance);

        sa.deposit(2000);
        sa.withdraw(1500);
        sa.displayBalance();

        System.out.println();

        // Current Account
        System.out.print("Enter initial balance for Current Account: ");
        double cbalance = sc.nextDouble();

        CurrentAccount ca = new CurrentAccount(cbalance);

        ca.deposit(3000);
        ca.withdraw(7000);
        ca.displayBalance();

        sc.close();
    }
}