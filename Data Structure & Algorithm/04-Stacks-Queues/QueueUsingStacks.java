package StacksQueues;

import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) return -1;

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) s2.push(s1.pop());
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(5); q.enqueue(10);
        System.out.println("Dequeued Element: " + q.dequeue());
    }
}
