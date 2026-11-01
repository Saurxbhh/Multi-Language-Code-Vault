package Arrays;

import java.util.HashSet;

/**
 * Problem: Check if an array contains duplicates
 * Language: Java
 * Time Complexity: O(n) - Single pass over the collection
 * Space Complexity: O(n) - To store unique elements in a HashSet
 */
public class ContainsDuplicates {
    public static boolean hasDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Duplicate identified
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 2};
        int[] arr2 = {1, 2, 3, 4, 5};
        
        System.out.println("Array 1 contains duplicates: " + hasDuplicates(arr1));
        System.out.println("Array 2 contains duplicates: " + hasDuplicates(arr2));
    }
}
