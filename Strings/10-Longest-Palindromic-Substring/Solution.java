/*
LeetCode 5: Longest Palindromic Substring

Approach:
Treat every character and every gap as a center.
Expand outward while characters match.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {


    static int start = 0;
    static int maxLen = 0;



    static void expand(String s, int left, int right) {


        while(left >= 0 &&
              right < s.length() &&
              s.charAt(left) == s.charAt(right)) {


            if(right - left + 1 > maxLen) {

                maxLen = right - left + 1;

                start = left;
            }


            left--;
            right++;
        }
    }



    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter string: ");
        String s = in.nextLine();



        for(int i = 0; i < s.length(); i++) {


            // Odd length palindrome
            expand(s, i, i);


            // Even length palindrome
            expand(s, i, i+1);
        }



        System.out.println(
            "Longest Palindrome: " +
            s.substring(start, start + maxLen)
        );
    }
}
