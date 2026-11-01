package Strings;

/**
 * Problem: Find the first non-repeating character in a string
 * Language: Java
 * Time Complexity: O(n) - Two passes across the string structure
 * Space Complexity: O(1) - Constant alphabet footprint tracking array
 */
public class FirstNonRepeating {
    public static char getFirstNonRepeatingChar(String str) {
        if (str == null || str.isEmpty()) return '\0';

        int[] charCounts = new int[256]; // Assuming standard ASCII lookup boundary

        // Populate metrics counts
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i)]++;
        }

        // Identify structural item
        for (int i = 0; i < str.length(); i++) {
            if (charCounts[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String text = "preprocessing";
        char result = getFirstNonRepeatingChar(text);
        
        if (result != '\0') {
            System.out.println("First non-repeating character in '" + text + "': " + result);
        } else {
            System.out.println("No distinct non-repeating characters identified.");
        }
    }
}
