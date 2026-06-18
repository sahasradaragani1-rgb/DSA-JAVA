/*
LeetCode 1299:
Replace Elements with Greatest Element on Right Side

Approach:
Traverse from right to left.

Maintain:
maxRight = greatest element seen so far.

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

        int maxRight = -1;

        for (int i = n - 1; i >= 0; i--) {

            int current = arr[i];

            arr[i] = maxRight;

            maxRight = Math.max(maxRight, current);
        }

        System.out.println("Modified Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
