/*
LeetCode 941: Valid Mountain Array

Approach:
1. Strictly increase.
2. Reach a peak.
3. Strictly decrease.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int i = 0;

        // Climb up
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak cannot be first or last element
        if (i == 0 || i == n - 1) {
            System.out.println(false);
            return;
        }

        // Climb down
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        System.out.println(i == n - 1);
    }
}
