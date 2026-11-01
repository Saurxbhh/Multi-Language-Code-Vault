package Arrays;

/**
 * Problem: Find the Maximum and Minimum element in an array
 * Language: Java
 * Time Complexity: O(n) - Single traversal
 * Space Complexity: O(1) - Auxiliary space
 */
public class FindMinMax {
    
    // Class to represent the result containing both min and max
    static class Pair {
        int min;
        int max;
    }

    public static Pair getMinMax(int[] arr) {
        Pair minmax = new Pair();
        int n = arr.length;

        // If there is only one element
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }

        // Initialize min and max based on the first two elements
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }

        // Traverse the rest of the array
        for (int i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }

        return minmax;
    }

    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        Pair result = getMinMax(arr);
        
        System.out.println("Array Element Analysis:");
        System.out.println("Minimum Element: " + result.min);
        System.out.println("Maximum Element: " + result.max);
    }
}
