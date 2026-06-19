/*
LeetCode 31: Next Permutation

Approach:
1. Find first decreasing element from right
2. Swap it with just larger element
3. Reverse remaining part

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        int[] nums = new int[n];


        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }


        int i = n - 2;


        // Step 1: Find break point
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }


        // Step 2: Find next greater element
        if(i >= 0) {

            int j = n - 1;

            while(nums[j] <= nums[i]) {
                j--;
            }


            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }


        // Step 3: Reverse right side
        int left = i + 1;
        int right = n - 1;


        while(left < right) {

            int temp = nums[left];

            nums[left] = nums[right];

            nums[right] = temp;

            left++;
            right--;
        }


        System.out.println("Next Permutation:");

        for(int x : nums) {
            System.out.print(x + " ");
        }
    }
}
