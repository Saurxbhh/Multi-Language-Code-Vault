package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Find duplicate characters in a string
 * Language: Java
 * Time Complexity: O(n) - Single pass collection traversal
 * Space Complexity: O(k) - Storage for unique characters in frequency map
 */
public class DuplicateCharacters {
    public static void findDuplicates(String str) {
        if (str == null || str.isEmpty()) return;

        Map<Character, Integer> charMap = new HashMap<>();
        
        // Build frequency map
        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate characters in '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1 && !Character.isWhitespace(entry.getKey())) {
                System.out.println(entry.getKey() + " -> repeated " + entry.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        String testStr = "uttaranchal university";
        findDuplicates(testStr);
    }
}
