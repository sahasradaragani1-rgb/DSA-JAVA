/*
LeetCode 67: Add Binary

Approach:
Traverse both strings from right to left.
Add digits along with carry.

Time Complexity: O(max(n,m))
Space Complexity: O(max(n,m))
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first binary string: ");
        String a = in.nextLine();

        System.out.print("Enter second binary string: ");
        String b = in.nextLine();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while(i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if(i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            ans.append(sum % 2);

            carry = sum / 2;
        }

        System.out.println("Binary Sum: " +
                ans.reverse().toString());
    }
}
