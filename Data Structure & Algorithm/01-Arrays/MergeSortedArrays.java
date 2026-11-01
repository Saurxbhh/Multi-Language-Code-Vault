package Arrays;

import java.util.Arrays;

/**
 * Problem: Merge two sorted arrays without using extra space
 * Language: Java
 * Time Complexity: O(n * m) - Insertion sorting logic variant
 * Space Complexity: O(1) - Purely in-place tracking
 */
public class MergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        // Traverse through all elements of arr2 from last to first
        for (int i = m - 1; i >= 0; i--) {
            int j;
            int last = arr1[n - 1];
            
            // Find smallest element greater than arr2[i] in arr1
            for (j = n - 2; j >= 0 && arr1[j] > arr2[i]; j--) {
                arr1[j + 1] = arr1[j];
            }

            // If an element was shifted, place arr2[i] in position
            if (j != n - 2 || last > arr2[i]) {
                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};

        merge(arr1, arr2);
        
        System.out.println("Merged Array 1: " + Arrays.toString(arr1));
        System.out.println("Merged Array 2: " + Arrays.toString(arr2));
    }
}
