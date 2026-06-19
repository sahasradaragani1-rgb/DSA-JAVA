/*
Largest Odd Number in String

Approach:
A number is odd if its last digit is odd.
Find the rightmost odd digit.
The prefix till that index is the largest odd number.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter number string: ");
        String s = in.nextLine();


        int index = -1;


        // Find last odd digit
        for(int i = s.length() - 1; i >= 0; i--) {


            char ch = s.charAt(i);


            if((ch - '0') % 2 == 1) {

                index = i;
                break;
            }
        }


        if(index == -1) {

            System.out.println("No odd number exists");
        }

        else {

            System.out.println(
                s.substring(0, index + 1)
            );
        }
    }
}
