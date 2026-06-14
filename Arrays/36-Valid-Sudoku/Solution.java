/*
LeetCode 36: Valid Sudoku

Approach:
Use three HashSets to track numbers in:
1. Rows
2. Columns
3. 3x3 Boxes

If a duplicate is found in any row, column, or box,
the Sudoku board is invalid.

Time Complexity: O(9 × 9) = O(1)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char[][] board = new char[9][9];

        System.out.println("Enter Sudoku board (9 rows, use . for empty cells):");

        for (int i = 0; i < 9; i++) {
            String row = in.next();

            for (int j = 0; j < 9; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        HashSet<String> seen = new HashSet<>();

        boolean valid = true;

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                char num = board[row][col];

                if (num == '.') {
                    continue;
                }

                String rowKey = num + " in row " + row;
                String colKey = num + " in col " + col;
                String boxKey = num + " in box " + (row / 3) + "-" + (col / 3);

                if (seen.contains(rowKey) ||
                    seen.contains(colKey) ||
                    seen.contains(boxKey)) {

                    valid = false;
                    break;
                }

                seen.add(rowKey);
                seen.add(colKey);
                seen.add(boxKey);
            }

            if (!valid) {
                break;
            }
        }

        System.out.println(valid);
    }
}
