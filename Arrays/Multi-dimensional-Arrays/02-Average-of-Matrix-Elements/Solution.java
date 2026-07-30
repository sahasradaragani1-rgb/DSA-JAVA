/*
Find Average of Matrix Elements

Approach:
Traverse every element of the 2D array using nested loops.
Calculate the sum of all elements and count the total number
of elements. The average is calculated as sum / count.

This solution works for both regular and jagged arrays.

Time Complexity: O(N)
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
        int count = 0;

        // Calculate sum and count of all elements
        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[i].length; j++) {

                sum += matrix[i][j];
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Average of all elements: " + average);
    }
}
