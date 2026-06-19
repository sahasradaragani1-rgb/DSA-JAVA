/*
LeetCode 1021: Remove Outermost Parentheses

Approach:
Track nesting depth.

When depth is 0:
opening bracket is outermost.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter parentheses string: ");
        String s = in.nextLine();



        StringBuilder ans = new StringBuilder();


        int depth = 0;



        for(char ch : s.toCharArray()) {


            if(ch == '(') {


                // not outermost '('
                if(depth > 0) {

                    ans.append(ch);
                }


                depth++;
            }


            else {


                depth--;


                // not outermost ')'
                if(depth > 0) {

                    ans.append(ch);
                }
            }
        }



        System.out.println("Result:");

        System.out.println(ans);
    }
}
