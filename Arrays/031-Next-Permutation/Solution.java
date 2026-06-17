/*
LeetCode 31: Next Permutation

Approach:

1. Find first decreasing element from the right.
2. Find the next greater element from the right.
3. Swap them.
4. Reverse the remaining suffix.

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

        int index = -1;

        // Step 1: Find breakpoint
        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index != -1) {

            for (int i = n - 1; i > index; i--) {

                if (nums[i] > nums[index]) {

                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;

                    break;
                }
            }
        }

        // Step 3: Reverse the suffix
        int left = index + 1;
        int right = n - 1;

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        System.out.println("Next Permutation:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
