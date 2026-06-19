/*
LeetCode 209: Minimum Size Subarray Sum

Approach:
Use Sliding Window.

Find the smallest subarray
whose sum >= target.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int target = in.nextInt();

        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right = 0; right < n; right++) {

            sum += nums[right];

            while(sum >= target) {

                minLen = Math.min(minLen,
                                  right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLen);
        }
    }
}
