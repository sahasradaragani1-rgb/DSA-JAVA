/*
LeetCode 905: Sort Array by Parity

Approach:
Use two pointers.
Place even numbers on left and odd numbers on right.

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

        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }


        int left = 0;
        int right = n - 1;


        while(left < right) {

            // left already has even
            if(nums[left] % 2 == 0) {
                left++;
            }

            // right already has odd
            else if(nums[right] % 2 != 0) {
                right--;
            }

            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }


        System.out.println("Sorted by Parity:");

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
