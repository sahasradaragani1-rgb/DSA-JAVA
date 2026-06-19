/*
LeetCode 28: Find the Index of the First Occurrence in a String

Approach:
Check every possible starting position.

Time Complexity: O(n*m)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter main string: ");
        String haystack = in.nextLine();


        System.out.print("Enter word to find: ");
        String needle = in.nextLine();



        int index = -1;



        for(int i = 0; i <= haystack.length() - needle.length(); i++) {


            int j = 0;


            while(j < needle.length() &&
                  haystack.charAt(i + j) == needle.charAt(j)) {

                j++;
            }



            if(j == needle.length()) {

                index = i;
                break;
            }
        }



        System.out.println("Index: " + index);
    }
}
