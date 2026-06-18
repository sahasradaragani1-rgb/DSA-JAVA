/*
LeetCode 1051: Height Checker

Approach:
Create a sorted copy of the array.
Count positions where original and sorted arrays differ.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int[] heights = new int[n];

        System.out.println("Enter heights:");

        for (int i = 0; i < n; i++) {
            heights[i] = in.nextInt();
        }

        int[] expected = heights.clone();

        Arrays.sort(expected);

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (heights[i] != expected[i]) {
                count++;
            }
        }

        System.out.println("Mismatch Count = " + count);
    }
}
