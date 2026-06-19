/*
LeetCode 796: Rotate String

Approach:
If goal string is a rotation of s,
then goal must exist inside s+s.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter original string: ");
        String s = in.nextLine();


        System.out.print("Enter goal string: ");
        String goal = in.nextLine();



        if(s.length() != goal.length()) {

            System.out.println("Not a rotation");
            return;
        }


        String doubled = s + s;


        if(doubled.contains(goal)) {

            System.out.println("Rotation exists");
        }

        else {

            System.out.println("Not a rotation");
        }
    }
}
