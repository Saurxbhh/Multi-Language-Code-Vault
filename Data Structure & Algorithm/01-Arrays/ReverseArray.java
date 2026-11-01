package Arrays;

import java.util.Arrays;

/**
 * Problem: Reverse an Array / Move all negative numbers to one side
 * Language: Java
 * Time Complexity: O(n) - Two-pointer approach
 * Space Complexity: O(1) - In-place modification
 */
public class ReverseArray {

    // Method to reverse the array in-place
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move pointers
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 9, 7};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
