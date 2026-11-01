package StacksQueues;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String expr) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                s.push(x);
                continue;
            }
            if (s.isEmpty()) return false;
            char check;
            switch (x) {
                case ')':
                    check = s.pop();
                    if (check == '{' || check == '[') return false;
                    break;
                case '}':
                    check = s.pop();
                    if (check == '(' || check == '[') return false;
                    break;
                case ']':
                    check = s.pop();
                    if (check == '(' || check == '{') return false;
                    break;
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println("Is string layout balanced? " + isBalanced(input));
    }
}
