package StacksQueues;

/**
 * Structure: Custom Stack (Array-Backed)
 * Language: Java
 * Core Operations: Push, Pop, Peek (LIFO)
 */
public class StackImplementation {
    private static final int MAX = 1000;
    private int top = -1;
    private int[] a = new int[MAX]; 

    public boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        a[++top] = x;
        return true;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[top--];
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();
        stack.push(5);
        stack.push(10);
        System.out.println(stack.pop() + " Popped from stack");
    }
}
