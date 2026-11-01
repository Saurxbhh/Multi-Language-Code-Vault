package SearchingSorting;

public class SquareRootBinary {
    public static int floorSqrt(int x) {
        if (x == 0 || x == 1) return x;
        long low = 1, high = x, ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == x) return (int) mid;
            if (mid * mid < x) {
                low = mid + 1;
                ans = mid; // Track floor tracking calculation target
            } else {
                high = mid - 1;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println("Floor square root of 11 is: " + floorSqrt(11));
    }
}
