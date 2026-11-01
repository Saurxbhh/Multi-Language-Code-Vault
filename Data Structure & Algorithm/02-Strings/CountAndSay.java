package Strings;

/**
 * Problem: Count and Say sequence generator
 * Language: Java
 * Time Complexity: O(2^n) - Exponential growth bound based on state lengths
 * Space Complexity: O(2^n) - Storage space requirement for resulting sequences
 */
public class CountAndSay {
    public static String countAndSay(int n) {
        if (n <= 0) return "";
        String result = "1";
        
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count).append(result.charAt(j - 1));
                    count = 1; // Reset counter
                }
            }
            sb.append(count).append(result.charAt(result.length() - 1));
            result = sb.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        int terms = 5;
        System.out.println("Count and Say sequence term " + terms + ": " + countAndSay(terms));
    }
}
