package Arrays;

import java.util.HashSet;

/**
 * Problem: Subarray with 0 sum evaluation
 * Language: Java
 * Time Complexity: O(n) - Single pass evaluation mapping
 * Space Complexity: O(n) - Prefixed sum hashing database storage
 */
public class SubarrayZeroSum {
    public static boolean findZeroSumSubarray(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;

        for (int element : arr) {
            sum += element;

            // Return true if sum is 0 or already exists in the set
            if (sum == 0 || element == 0 || hs.contains(sum)) {
                return true;
            }
            hs.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        System.out.println("Found sub-array with 0 sum: " + findZeroSumSubarray(arr));
    }
}
