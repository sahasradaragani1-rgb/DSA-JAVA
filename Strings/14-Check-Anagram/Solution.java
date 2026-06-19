/*
Check Anagram

Approach:
Count frequency of characters.

Time Complexity: O(n)
Space Complexity: O(1) (for fixed charset)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter first string: ");
        String s = in.nextLine();


        System.out.print("Enter second string: ");
        String t = in.nextLine();



        if(s.length() != t.length()) {

            System.out.println("Not Anagram");
            return;
        }



        int[] freq = new int[26];



        for(char ch : s.toCharArray()) {

            freq[ch - 'a']++;
        }



        for(char ch : t.toCharArray()) {

            freq[ch - 'a']--;
        }



        for(int x : freq) {

            if(x != 0) {

                System.out.println("Not Anagram");
                return;
            }
        }



        System.out.println("Anagram");
    }
}
