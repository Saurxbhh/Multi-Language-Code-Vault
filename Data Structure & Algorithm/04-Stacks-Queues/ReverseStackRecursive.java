package StacksQueues;

import java.util.Stack;

public class ReverseStackRecursive {
    private static Stack<Integer> st = new Stack<>();

    private static void insertAtBottom(int x) {
        if (st.isEmpty()) { st.push(x); return; }
        int a = st.pop();
        insertAtBottom(x);
        st.push(a);
    }

    public static void reverse() {
        if (!st.isEmpty()) {
            int x = st.pop();
            reverse();
            insertAtBottom(x);
        }
    }

    public static void main(String[] args) {
        st.push(1); st.push(2); st.push(3);
        System.out.println("Original: " + st);
        reverse();
        System.out.println("Reversed: " + st);
    }
}
