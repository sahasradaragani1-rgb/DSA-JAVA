/*
LeetCode 73: Set Matrix Zeroes

Approach:
Use first row and first column as markers.

Time Complexity: O(m*n)
Space Complexity: O(1)
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


        boolean firstRowZero = false;
        boolean firstColZero = false;


        // Check first row
        for(int j = 0; j < n; j++) {

            if(matrix[0][j] == 0)
                firstRowZero = true;
        }


        // Check first column
        for(int i = 0; i < m; i++) {

            if(matrix[i][0] == 0)
                firstColZero = true;
        }



        // Use first row and column as markers
        for(int i = 1; i < m; i++) {

            for(int j = 1; j < n; j++) {

                if(matrix[i][j] == 0) {

                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }



        // Set cells to zero using markers
        for(int i = 1; i < m; i++) {

            for(int j = 1; j < n; j++) {

                if(matrix[i][0] == 0 ||
                   matrix[0][j] == 0) {

                    matrix[i][j] = 0;
                }
            }
        }



        // Zero first row
        if(firstRowZero) {

            for(int j = 0; j < n; j++)
                matrix[0][j] = 0;
        }


        // Zero first column
        if(firstColZero) {

            for(int i = 0; i < m; i++)
                matrix[i][0] = 0;
        }



        System.out.println("Result:");

        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
