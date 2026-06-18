/*
LeetCode 448: Find All Numbers Disappeared in an Array

Approach:
Use array indices as markers.

For every number x:
Mark index (x-1) as negative.

The indices which remain positive are missing numbers.

Time Complexity: O(n)
Space Complexity: O(1) (excluding output list)
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


        for (int i = 0; i < n; i++) {

            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }


        System.out.println("Missing numbers:");

        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
