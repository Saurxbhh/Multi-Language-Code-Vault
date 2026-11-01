package Strings;

/**
 * Problem: Check if a string is a valid shuffle of two distinct strings
 * Language: Java
 * Time Complexity: O(n) - Single parallel index traversal logic pass
 * Space Complexity: O(1) - Static parameter registers
 */
public class ValidShuffleCheck {
    public static boolean isValidShuffle(String first, String second, String result) {
        if (first.length() + second.length() != result.length()) {
            return false;
        }

        int i = 0, j = 0, k = 0;

        while (k < result.length()) {
            // Check match with first string index tracking bound
            if (i < first.length() && first.charAt(i) == result.charAt(k)) {
                i++;
            }
            // Check match with second string index tracking bound
            else if (j < second.length() && second.charAt(j) == result.charAt(k)) {
                j++;
            }
            // Discrepancy identified
            else {
                return false;
            }
            k++;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String shuffle = "dabecf";

        System.out.println("Is '" + shuffle + "' a valid shuffle of '" + str1 + "' and '" + str2 + "'? " + isValidShuffle(str1, str2, shuffle));
    }
}
