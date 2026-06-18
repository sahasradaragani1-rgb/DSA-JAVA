/*
LeetCode 66: Plus One

Approach:
Start from the last digit.
If digit is less than 9, increment it and stop.
If digit is 9, make it 0 and carry 1 to the previous digit.
If all digits are 9, create a new array.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int n = in.nextInt();

        int[] digits = new int[n];

        System.out.println("Enter digits:");

        for (int i = 0; i < n; i++) {
            digits[i] = in.nextInt();
        }

        boolean done = false;

        for (int i = n - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                done = true;
                break;
            }

            digits[i] = 0;
        }

        if (done) {

            System.out.println("Result:");

            for (int num : digits) {
                System.out.print(num + " ");
            }

        } else {

            int[] result = new int[n + 1];
            result[0] = 1;

            System.out.println("Result:");

            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
}
