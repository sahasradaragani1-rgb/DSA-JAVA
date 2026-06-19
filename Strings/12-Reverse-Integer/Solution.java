/*
LeetCode 7: Reverse Integer

Approach:
Extract digits using modulo.
Build reversed number.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        System.out.print("Enter number: ");
        int n = in.nextInt();



        int rev = 0;



        while(n != 0) {


            int digit = n % 10;


            n = n / 10;



            // overflow check before multiplying by 10
            if(rev > Integer.MAX_VALUE / 10 ||
               rev < Integer.MIN_VALUE / 10) {

                System.out.println(0);
                return;
            }



            rev = rev * 10 + digit;
        }



        System.out.println("Reversed number: " + rev);
    }
}
