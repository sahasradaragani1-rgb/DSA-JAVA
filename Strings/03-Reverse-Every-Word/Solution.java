/*
Reverse every word in a string

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = in.nextLine();


        String[] words = s.split(" ");


        StringBuilder result = new StringBuilder();


        for(String word : words) {


            StringBuilder rev = new StringBuilder(word);

            rev.reverse();


            result.append(rev).append(" ");
        }


        System.out.println(result.toString().trim());
    }
}
