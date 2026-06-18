/*
LeetCode 485: Max Consecutive Ones

Approach:
Traverse the array and maintain:
1. Current streak of consecutive 1s
2. Maximum streak seen so far

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

        System.out.println("Enter array elements (0 or 1):");

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        System.out.println("Maximum Consecutive Ones = " + maxCount);
    }
}
