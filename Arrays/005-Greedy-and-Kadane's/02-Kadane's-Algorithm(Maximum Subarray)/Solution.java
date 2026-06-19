/*
LeetCode 53: Maximum Subarray

Approach:
Kadane's Algorithm

If current sum becomes negative,
discard it and start a new subarray.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            maxi = Math.max(maxi, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxi);
    }
}
