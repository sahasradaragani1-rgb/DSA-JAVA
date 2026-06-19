/*
LeetCode 561: Array Partition

Approach:
Sort the array.
Pair adjacent elements.
Take the smaller element from each pair.

Time Complexity: O(n log n)
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


        Arrays.sort(nums);


        int sum = 0;


        for(int i = 0; i < n; i += 2) {

            sum += nums[i];
        }


        System.out.println("Maximum Sum = " + sum);
    }
}
