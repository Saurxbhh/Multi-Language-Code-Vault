package Strings;

/**
 * Problem: Reverse words in a given string sentence
 * Language: Java
 * Time Complexity: O(n) - Linear parsing routine
 * Space Complexity: O(n) - Temporary storage array for split tokens
 */
public class ReverseWords {
    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) return sentence;

        // Split by one or more spaces
        String[] words = sentence.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String original = "Data Structures and Algorithms";
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reverseWords(original));
    }
}
