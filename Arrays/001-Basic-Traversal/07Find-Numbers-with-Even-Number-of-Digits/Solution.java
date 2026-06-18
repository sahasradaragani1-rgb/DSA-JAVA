/*
LeetCode 1295: Find Numbers with Even Number of Digits

Approach:
Count the digits of each number.
If the digit count is even, increase the answer.

Time Complexity: O(n * d)
d = number of digits

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

        int countEvenDigits = 0;

        for (int num : nums) {

            int digits = 0;
            int temp = num;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            if (digits % 2 == 0) {
                countEvenDigits++;
            }
        }

        System.out.println("Count = " + countEvenDigits);
    }
}
