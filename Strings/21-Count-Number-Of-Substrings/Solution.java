/*
Count Number of Substrings

Approach:
For a string of length n:

Total Substrings =
n * (n + 1) / 2

Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = in.nextLine();

        int n = s.length();

        long count = (long)n * (n + 1) / 2;

        System.out.println("Total Substrings: " + count);
    }
}
