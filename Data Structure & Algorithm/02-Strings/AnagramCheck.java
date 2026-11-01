package Strings;

import java.util.Arrays;

/**
 * Problem: Check if two strings are Anagrams of each other
 * Language: Java
 * Time Complexity: O(n log n) - Sorting based validation execution
 * Space Complexity: O(1) - Modifying native sequences directly
 */
public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        char[] array1 = str1.toLowerCase().toCharArray();
        char[] array2 = str2.toLowerCase().toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        
        System.out.println("Are '" + s1 + "' and '" + s2 + "' anagrams? " + isAnagram(s1, s2));
    }
}
