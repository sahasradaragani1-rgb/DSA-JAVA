/*
LeetCode 2149: Rearrange Array Elements by Sign

Approach:
Place positive numbers at even indices.
Place negative numbers at odd indices.

Time Complexity: O(n)
Space Complexity: O(n)
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

        int[] ans = new int[n];

        int pos = 0;
        int neg = 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] >= 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }

        System.out.println("Rearranged Array:");

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
