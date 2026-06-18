/*
LeetCode 724: Find Pivot Index

Approach:
Calculate total sum.
Maintain left sum while traversing.

Pivot Index:
leftSum == totalSum - leftSum - nums[i]

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

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                System.out.println("Pivot Index = " + i);
                return;
            }

            leftSum += nums[i];
        }

        System.out.println("-1");
    }
}
