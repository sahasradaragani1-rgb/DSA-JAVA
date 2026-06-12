/*
LeetCode 189: Rotate Array

Approach:
Reverse the entire array, then reverse the first k elements,
and finally reverse the remaining elements.

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

        System.out.print("Enter k: ");
        int k = in.nextInt();

        k = k % n;

        // Reverse entire array
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        // Reverse first k elements
        left = 0;
        right = k - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        // Reverse remaining elements
        left = k;
        right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        System.out.println("Array after rotation:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
