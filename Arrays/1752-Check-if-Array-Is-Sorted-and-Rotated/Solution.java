/*
LeetCode 1752: Check if Array Is Sorted and Rotated

Approach:
Count the number of places where nums[i] > nums[(i+1)%n].

For a sorted and rotated array, this count can be at most 1.

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

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        System.out.println(count <= 1);
    }
}
