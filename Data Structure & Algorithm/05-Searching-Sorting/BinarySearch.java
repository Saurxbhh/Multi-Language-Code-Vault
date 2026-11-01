package SearchingSorting;

public class BinarySearch {
    // 1. Iterative Approach - O(log n) Time | O(1) Space
    public static int searchIterative(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 2. Recursive Approach - O(log n) Time | O(log n) Stack Space
    public static int searchRecursive(int[] arr, int low, int high, int target) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return searchRecursive(arr, mid + 1, high, target);
        return searchRecursive(arr, low, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        System.out.println("Index of 10 (Iterative): " + searchIterative(arr, 10));
    }
}
