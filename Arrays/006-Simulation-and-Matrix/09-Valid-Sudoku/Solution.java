/*
LeetCode 36: Valid Sudoku

Approach:
Check rows, columns, and 3x3 boxes.

Time Complexity: O(9*9)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char[][] board = new char[9][9];


        System.out.println("Enter sudoku board:");

        for(int i = 0; i < 9; i++) {

            for(int j = 0; j < 9; j++) {

                board[i][j] = in.next().charAt(0);
            }
        }


        boolean valid = true;


        // Check rows
        for(int i = 0; i < 9; i++) {

            HashSet<Character> set = new HashSet<>();

            for(int j = 0; j < 9; j++) {

                char ch = board[i][j];

                if(ch != '.') {

                    if(set.contains(ch)) {
                        valid = false;
                        break;
                    }

                    set.add(ch);
                }
            }
        }



        // Check columns
        for(int j = 0; j < 9; j++) {

            HashSet<Character> set = new HashSet<>();

            for(int i = 0; i < 9; i++) {

                char ch = board[i][j];

                if(ch != '.') {

                    if(set.contains(ch)) {
                        valid = false;
                        break;
                    }

                    set.add(ch);
                }
            }
        }



        // Check 3x3 boxes
        for(int r = 0; r < 9; r += 3) {

            for(int c = 0; c < 9; c += 3) {


                HashSet<Character> set = new HashSet<>();


                for(int i = r; i < r+3; i++) {

                    for(int j = c; j < c+3; j++) {


                        char ch = board[i][j];


                        if(ch != '.') {

                            if(set.contains(ch)) {
                                valid = false;
                            }

                            set.add(ch);
                        }
                    }
                }
            }
        }


        System.out.println(valid ? "Valid Sudoku" : "Invalid Sudoku");
    }
}
