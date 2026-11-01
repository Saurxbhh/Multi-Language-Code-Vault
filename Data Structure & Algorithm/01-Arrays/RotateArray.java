package Arrays;

import java.util.Arrays;

/**
 * Problem: Rotate an array by one position clockwise
 * Language: Java
 * Time Complexity: O(n) - Single traversal linear pass
 * Space Complexity: O(1) - Auxiliary in-place manipulation
 */
public class RotateArray {
    public static void rotateClockwise(int[] arr) {
        if (arr.length <= 1) return;
        
        int lastElement = arr[arr.length - 1];
        
        // Shift elements to the right from end to start
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement; // Place last element at front
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Before Rotation: " + Arrays.toString(arr));
        rotateClockwise(arr);
        System.out.println("After Rotation:  " + Arrays.toString(arr));
    }
}
