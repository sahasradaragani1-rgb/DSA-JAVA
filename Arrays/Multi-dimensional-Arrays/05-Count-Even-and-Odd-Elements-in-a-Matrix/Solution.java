/*
Count Even and Odd Elements in a Matrix

Approach:
Traverse every element of the 2D array.
If an element is divisible by 2, increment the even count.
Otherwise, increment the odd count.

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

        int evenCount = 0;
        int oddCount = 0;

        // Traverse the matrix
        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j] % 2 == 0) {
                    evenCount++;
                }
                else {
                    oddCount++;
                }
            }
        }

        System.out.println("Even elements: " + evenCount);
        System.out.println("Odd elements: " + oddCount);
    }
}
