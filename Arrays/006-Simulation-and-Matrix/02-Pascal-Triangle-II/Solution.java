/*
LeetCode 119: Pascal's Triangle II

Approach:
Generate only the required row using 1D array.

Time Complexity: O(rowIndex²)
Space Complexity: O(rowIndex)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter row index: ");
        int rowIndex = in.nextInt();


        ArrayList<Integer> row = new ArrayList<>();

        row.add(1);


        for(int i = 1; i <= rowIndex; i++) {

            for(int j = i - 1; j >= 1; j--) {

                row.set(j, row.get(j) + row.get(j - 1));
            }

            row.add(1);
        }


        System.out.println(row);
    }
}
