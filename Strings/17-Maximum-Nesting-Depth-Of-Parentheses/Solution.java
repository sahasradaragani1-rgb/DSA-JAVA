/*
LeetCode 1614: Maximum Nesting Depth of Parentheses

Approach:
Track current depth.
Maximum value reached is the answer.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter parentheses string: ");
        String s = in.nextLine();



        int depth = 0;
        int maxDepth = 0;



        for(char ch : s.toCharArray()) {


            if(ch == '(') {

                depth++;

                maxDepth = Math.max(maxDepth, depth);
            }


            else if(ch == ')') {

                depth--;
            }
        }



        System.out.println("Maximum Depth: " + maxDepth);
    }
}
