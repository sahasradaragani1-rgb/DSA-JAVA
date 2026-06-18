/*
LeetCode 387: First Unique Character in a String

Approach:
1. Count frequency of each character.
2. Traverse again and find the first character
   whose frequency is 1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = in.nextLine();

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            if (freq[s.charAt(i) - 'a'] == 1) {

                System.out.println("Index = " + i);
                System.out.println("Character = " + s.charAt(i));
                return;
            }
        }

        System.out.println("-1");
    }
}
