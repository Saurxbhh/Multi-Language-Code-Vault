package SearchingSorting;

import java.util.Arrays;

public class CountTriplets {
    public static int countTriplets(int[] arr, int sum) {
        Arrays.sort(arr);
        int ans = 0, n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1, k = n - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] >= sum) {
                    k--;
                } else {
                    ans += (k - j); // Elements between j and k satisfy target parameters
                    j++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 7};
        System.out.println("Count of matching triplets: " + countTriplets(arr, 12));
    }
}
