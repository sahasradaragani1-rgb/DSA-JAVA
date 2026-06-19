/*
Find Repeating and Missing Number

Approach:
Use sum and square sum equations.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Enter size: ");
        int n = in.nextInt();


        int[] nums = new int[n];


        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }


        long actualSum = 0;
        long actualSquareSum = 0;


        for(int x : nums) {

            actualSum += x;
            actualSquareSum += (long)x * x;
        }


        long expectedSum = (long)n * (n + 1) / 2;

        long expectedSquareSum =
                (long)n * (n + 1) * (2*n + 1) / 6;


        /*
        x = repeating
        y = missing

        x - y = actualSum - expectedSum

        x² - y² = actualSquareSum - expectedSquareSum

        (x-y)(x+y) = square difference
        */


        long diff = actualSum - expectedSum;

        long squareDiff = actualSquareSum - expectedSquareSum;


        long sum = squareDiff / diff;


        long repeating = (diff + sum) / 2;

        long missing = sum - repeating;


        System.out.println("Repeating number: " + repeating);

        System.out.println("Missing number: " + missing);
    }
}
