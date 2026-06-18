/*
LeetCode 242: Valid Anagram

Approach:
Count frequency of characters using an array.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = in.nextLine();

        System.out.print("Enter second string: ");
        String t = in.nextLine();

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
