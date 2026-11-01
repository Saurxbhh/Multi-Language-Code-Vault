package StacksQueues;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> s = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        s.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) minStack.push(x);
    }

    public int pop() {
        int x = s.pop();
        if (x == minStack.peek()) minStack.pop();
        return x;
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(15); ms.push(5); ms.push(20);
        System.out.println("Current Minimum element: " + ms.getMin());
    }
}
