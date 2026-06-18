/*
LeetCode 27: Remove Element

Approach:
Use two pointers.
Store elements that are not equal to val
at the beginning of the array.

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

        System.out.print("Enter element to remove: ");
        int val = in.nextInt();


        int k = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }


        System.out.println("New length = " + k);

        System.out.print("Array after removal: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
