/*
LeetCode 268: Missing Number

Approach:
Use XOR.

Properties:
a ^ a = 0
a ^ 0 = a

XOR all indices and array elements.
All matching numbers cancel out.
The remaining value is the missing number.

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

        int missing = n;

        for (int i = 0; i < n; i++) {
            missing ^= i ^ nums[i];
        }

        System.out.println("Missing Number = " + missing);
    }
}
