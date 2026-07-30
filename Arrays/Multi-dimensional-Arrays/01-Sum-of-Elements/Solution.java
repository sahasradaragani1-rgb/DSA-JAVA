/*
Sum of All Elements in a Matrix

Approach:
Traverse every row and process each element in that row.
Using matrix[i].length makes the solution work for both
regular 2D arrays and jagged arrays.

Time Complexity: O(n)
Space Complexity: O(1) auxiliary space
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] matrix = new int[rows][];

        // Input each row separately to support jagged arrays
        for(int i = 0; i < rows; i++) {

            System.out.print("Enter number of elements in row " + (i + 1) + ": ");
            int cols = sc.nextInt();

            matrix[i] = new int[cols];

            System.out.println("Enter elements:");

            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // Traverse the matrix
        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[i].length; j++) {

                sum += matrix[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}
