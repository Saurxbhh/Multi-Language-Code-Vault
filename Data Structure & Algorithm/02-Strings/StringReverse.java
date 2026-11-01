package Strings;

/**
 * Problem: String Manipulation & Reversal
 * Language: Java
 * Complexity: O(n) Time | O(n) Space
 */
public class StringReverse {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Uttaranchal University";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverse(input));
    }
}
