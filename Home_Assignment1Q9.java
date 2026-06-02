import java.util.Scanner;

// Shared class for alternate printing
class AlternatePrinter {
    private boolean firstTurn = true;

    // Method for first thread
    synchronized void printFirst(String word) {
        try {
            while (!firstTurn) {
                wait();
            }

            System.out.print(word + " ");
            firstTurn = false;
            notify();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method for second thread
    synchronized void printSecond(String word) {
        try {
            while (firstTurn) {
                wait();
            }

            System.out.print(word + " ");
            firstTurn = true;
            notify();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Thread for first line
class Thread1 extends Thread {
    private String[] words;
    private AlternatePrinter printer;

    Thread1(String line, AlternatePrinter p) {
        words = line.split(" ");
        printer = p;
    }

    public void run() {
        for (String word : words) {
            printer.printFirst(word);
        }
    }
}

// Thread for second line
class Thread2 extends Thread {
    private String[] words;
    private AlternatePrinter printer;

    Thread2(String line, AlternatePrinter p) {
        words = line.split(" ");
        printer = p;
    }

    public void run() {
        for (String word : words) {
            printer.printSecond(word);
        }
    }
}

// Main class
public class Home_Assignment1Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input lines
        System.out.print("Enter first line: ");
        String line1 = sc.nextLine();

        System.out.print("Enter second line: ");
        String line2 = sc.nextLine();

        AlternatePrinter printer = new AlternatePrinter();

        // Creating threads
        Thread1 t1 = new Thread1(line1, printer);
        Thread2 t2 = new Thread2(line2, printer);

        // Starting threads
        t1.start();
        t2.start();

        // Waiting for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
