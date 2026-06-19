/*
LeetCode 13: Roman to Integer

Approach:
Traverse from right to left.

If current value < previous value:
subtract it.

Else:
add it.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    static int value(char ch) {

        switch(ch) {

            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;

            default: return 0;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Roman Number: ");
        String s = in.nextLine();

        int ans = 0;
        int prev = 0;

        for(int i = s.length() - 1; i >= 0; i--) {

            int curr = value(s.charAt(i));

            if(curr < prev) {

                ans -= curr;
            }
            else {

                ans += curr;
            }

            prev = curr;
        }

        System.out.println("Integer Value: " + ans);
    }
}
