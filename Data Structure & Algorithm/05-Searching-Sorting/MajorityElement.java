package SearchingSorting;

public class MajorityElement {
    // Boyer-Moore Majority Voting Algorithm - O(n) Time | O(1) Space
    public static int findMajority(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + findMajority(arr));
    }
}
