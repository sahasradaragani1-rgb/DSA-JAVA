/*
LeetCode 283: Move Zeroes

Approach:
Use two pointers.
Move all non-zero elements to the front while maintaining their order.
Fill the remaining positions with zeros.

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

        int k = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        while (k < n) {
            nums[k] = 0;
            k++;
        }

        System.out.println("Array after moving zeroes:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
