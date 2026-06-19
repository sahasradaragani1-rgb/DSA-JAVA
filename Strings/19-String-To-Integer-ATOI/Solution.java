/*
LeetCode 8: String to Integer (atoi)

Approach:
1. Ignore leading spaces
2. Handle sign
3. Build number digit by digit
4. Handle overflow

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = in.nextLine();

        int i = 0;
        int n = s.length();

        // Skip leading spaces
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Handle sign
        int sign = 1;

        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if(s.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        }

        long num = 0;

        // Process digits
        while(i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            num = num * 10 + digit;

            // Overflow handling
            if(sign * num > Integer.MAX_VALUE) {

                System.out.println(Integer.MAX_VALUE);
                return;
            }

            if(sign * num < Integer.MIN_VALUE) {

                System.out.println(Integer.MIN_VALUE);
                return;
            }

            i++;
        }

        System.out.println((int)(sign * num));
    }
}
