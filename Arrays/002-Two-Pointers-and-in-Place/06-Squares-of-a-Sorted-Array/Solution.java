/*
LeetCode 977: Squares of a Sorted Array

Approach:
Use two pointers.
Largest square will come from either end
because negative numbers also become positive.

Fill result array from right to left.

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

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }


        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;

        int index = n - 1;


        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];


            if (leftSquare > rightSquare) {

                ans[index] = leftSquare;
                left++;

            } else {

                ans[index] = rightSquare;
                right--;
            }

            index--;
        }


        System.out.println("Sorted Squares:");

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
