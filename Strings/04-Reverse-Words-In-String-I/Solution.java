/*
LeetCode 151: Reverse Words in a String

Approach:
Reverse the order of words.
Remove extra spaces.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Enter string: ");
        String s = in.nextLine();


        String[] words = s.trim().split("\\s+");


        StringBuilder ans = new StringBuilder();


        for(int i = words.length - 1; i >= 0; i--) {


            ans.append(words[i]);


            if(i != 0) {
                ans.append(" ");
            }
        }


        System.out.println("Reversed words:");

        System.out.println(ans);
    }
}
