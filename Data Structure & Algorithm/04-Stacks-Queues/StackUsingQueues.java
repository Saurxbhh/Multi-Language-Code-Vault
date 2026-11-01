package StacksQueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // O(n) push operation to keep pop O(1)
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) q2.add(q1.remove());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (q1.isEmpty()) return -1;
        return q1.remove();
    }

    public static void main(String[] args) {
        StackUsingQueues s = new StackUsingQueues();
        s.push(1); s.push(2);
        System.out.println("Popped Element: " + s.pop());
    }
}
