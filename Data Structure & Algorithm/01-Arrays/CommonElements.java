package Arrays;

import java.util.ArrayList;

/**
 * Problem: Find common elements in three sorted arrays
 * Language: Java
 * Time Complexity: O(n1 + n2 + n3) - Linear intersection scan
 * Space Complexity: O(1) - Direct standard processing output
 */
public class CommonElements {
    public static void findCommon(int[] ar1, int[] ar2, int[] ar3) {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> common = new ArrayList<>();

        while (i < ar1.length && j < ar2.length && k < ar3.length) {
            // If x = y and y = z, print any and move ahead
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                if (!common.contains(ar1[i])) { // Avoid handling duplicates
                    common.add(ar1[i]);
                }
                i++; j++; k++;
            }
            // Move pointer for smaller element
            else if (ar1[i] < ar2[j]) i++;
            else if (ar2[j] < ar3[k]) j++;
            else k++;
        }
        System.out.println("Common Elements: " + common);
    }

    public static void main(String[] args) {
        int[] ar1 = {1, 5, 10, 20, 40, 80};
        int[] ar2 = {6, 7, 20, 80, 100};
        int[] ar3 = {3, 4, 15, 20, 30, 70, 80, 120};

        findCommon(ar1, ar2, ar3);
    }
}
