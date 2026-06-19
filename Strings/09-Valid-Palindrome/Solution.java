/*
LeetCode 125: Valid Palindrome

Approach:
Use two pointers.
Ignore non-alphanumeric characters.
Compare characters.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter string: ");
        String s = in.nextLine();



        int left = 0;
        int right = s.length() - 1;


        boolean valid = true;



        while(left < right) {


            // skip non-alphanumeric from left
            while(left < right &&
                  !Character.isLetterOrDigit(s.charAt(left))) {

                left++;
            }



            // skip non-alphanumeric from right
            while(left < right &&
                  !Character.isLetterOrDigit(s.charAt(right))) {

                right--;
            }



            if(Character.toLowerCase(s.charAt(left)) !=
               Character.toLowerCase(s.charAt(right))) {


                valid = false;
                break;
            }


            left++;
            right--;
        }



        System.out.println(valid ? 
            "Valid Palindrome" : 
            "Not a Palindrome");
    }
}
