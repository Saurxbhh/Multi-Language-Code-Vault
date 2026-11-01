package Arrays;

import java.util.Arrays;

/**
 * Problem: Find the "Kth" max and min element of an array
 * Language: Java
 * Time Complexity: O(n log n) - Due to sorting framework
 * Space Complexity: O(1) - Auxiliary space
 */
public class KthMinMax {
    public static void findKthElements(int[] arr, int k) {
        if (k > arr.length || k <= 0) {
            System.out.println("Invalid value of K");
            return;
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        int kthMin = arr[k - 1];
        int kthMax = arr[arr.length - k];

        System.out.println(k + "nd/th Minimum Element: " + kthMin);
        System.out.println(k + "nd/th Maximum Element: " + kthMax);
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19, 1};
        int k = 2; // Find 2nd min and 2nd max
        System.out.println("Input Array: " + Arrays.toString(arr));
        findKthElements(arr, k);
    }
}
