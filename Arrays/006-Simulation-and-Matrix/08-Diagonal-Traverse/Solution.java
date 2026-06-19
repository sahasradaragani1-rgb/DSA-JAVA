/*
LeetCode 498: Diagonal Traverse

Approach:
Move diagonally.
Change direction when hitting boundary.

Time Complexity: O(m*n)
Space Complexity: O(1) (excluding output)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = in.nextInt();

        System.out.print("Enter columns: ");
        int n = in.nextInt();


        int[][] matrix = new int[m][n];


        System.out.println("Enter matrix:");

        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                matrix[i][j] = in.nextInt();
            }
        }


        ArrayList<Integer> ans = new ArrayList<>();


        int row = 0;
        int col = 0;

        boolean up = true;


        for(int i = 0; i < m*n; i++) {


            ans.add(matrix[row][col]);


            if(up) {

                // moving up-right
                if(col == n-1) {

                    row++;
                    up = false;
                }

                else if(row == 0) {

                    col++;
                    up = false;
                }

                else {

                    row--;
                    col++;
                }
            }


            else {

                // moving down-left
                if(row == m-1) {

                    col++;
                    up = true;
                }

                else if(col == 0) {

                    row++;
                    up = true;
                }

                else {

                    row++;
                    col--;
                }
            }
        }


        System.out.println("Diagonal Order:");

        for(int x : ans) {

            System.out.print(x + " ");
        }
    }
}
