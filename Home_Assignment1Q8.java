import java.util.Scanner;
interface Stack {
    void push(int data);
    int pop();
    void display();
}
class ArrayStack implements Stack {
    private int[] stack;
    private int top;
    private int capacity;
    ArrayStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }
    public void push(int data) {
        // Dynamic resizing
        if (top == capacity - 1) {
            resize();
        }
        stack[++top] = data;
        System.out.println(data + " pushed into stack.");
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
    private void resize() {
        capacity = capacity * 2;
        int[] newStack = new int[capacity];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        System.out.println("Stack resized to capacity: " + capacity);
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
public class Home_Assignment1Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayStack st = new ArrayStack(3);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println("Popped Element: " + st.pop());
        st.display();
        sc.close();
    }
}