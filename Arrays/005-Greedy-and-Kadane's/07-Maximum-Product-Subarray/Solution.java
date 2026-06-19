/*
LeetCode 152: Maximum Product Subarray

Approach:
Maintain both maximum and minimum product ending at current index.

Why?
A negative number can turn a minimum product into maximum.

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

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }


        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];


        for(int i = 1; i < n; i++) {

            int tempMax = Math.max(
                    nums[i],
                    Math.max(maxProd * nums[i],
                             minProd * nums[i])
            );

            minProd = Math.min(
                    nums[i],
                    Math.min(maxProd * nums[i],
                             minProd * nums[i])
            );

            maxProd = tempMax;

            ans = Math.max(ans, maxProd);
        }


        System.out.println("Maximum Product = " + ans);
    }
}
