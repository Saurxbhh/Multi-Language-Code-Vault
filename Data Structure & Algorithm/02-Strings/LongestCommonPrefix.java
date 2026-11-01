package Strings;

/**
 * Problem: Find the longest common prefix among an array of strings
 * Language: Java
 * Time Complexity: O(s) - where S is the total count of characters across strings
 * Space Complexity: O(1) - Constant computational footprint
 */
public class LongestCommonPrefix {
    public static String getLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // Trim down prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"university", "universal", "universe"};
        System.out.println("Longest Common Prefix: " + getLongestCommonPrefix(words));
    }
}
