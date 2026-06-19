/*
Pascal Triangle III

Find value at a given row and column.

Approach:
Use nCr formula.

Time Complexity: O(r)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter row: ");
        int row = in.nextInt();

        System.out.print("Enter column: ");
        int col = in.nextInt();


        // converting to 0-based index
        int n = row - 1;
        int r = col - 1;


        long result = 1;


        // Calculate nCr
        for(int i = 0; i < r; i++) {

            result = result * (n - i) / (i + 1);
        }


        System.out.println("Element = " + result);
    }
}
