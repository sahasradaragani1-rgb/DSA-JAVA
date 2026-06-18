/*
LeetCode 136: Single Number

Approach:
Use XOR operation.
Duplicate numbers cancel each other out.

a ^ a = 0
a ^ 0 = a

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

        int single = 0;

        for (int i = 0; i < n; i++) {
            single ^= nums[i];
        }

        System.out.println("Single Number = " + single);
    }
}
