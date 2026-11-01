package SearchingSorting;

public class FixedPoint {
    public static int binarySearchFixedPoint(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == mid) return mid;
            if (arr[mid] < mid) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -5, 0, 3, 7}; // Index 3 matches value 3
        System.out.println("Fixed point identified at index: " + binarySearchFixedPoint(arr));
    }
}
