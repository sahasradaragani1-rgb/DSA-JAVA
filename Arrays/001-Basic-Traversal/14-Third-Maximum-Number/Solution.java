/*
LeetCode 414: Third Maximum Number

Approach:
Maintain first, second and third maximum values.

Use Long to handle Integer.MIN_VALUE cases.

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


        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;


        for (int num : nums) {

            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {

                third = second;
                second = first;
                first = num;

            } else if (num > second) {

                third = second;
                second = num;

            } else if (num > third) {

                third = num;
            }
        }


        if (third == Long.MIN_VALUE) {
            System.out.println("Third Maximum = " + first);
        } else {
            System.out.println("Third Maximum = " + third);
        }
    }
}
