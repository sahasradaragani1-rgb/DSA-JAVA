/*
LeetCode 48: Rotate Image

Approach:
1. Transpose matrix
2. Reverse every row

Time Complexity: O(n²)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of matrix: ");
        int n = in.nextInt();


        int[][] matrix = new int[n][n];


        System.out.println("Enter matrix:");

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                matrix[i][j] = in.nextInt();
            }
        }


        // Step 1: Transpose
        for(int i = 0; i < n; i++) {

            for(int j = i; j < n; j++) {

                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];

                matrix[j][i] = temp;
            }
        }


        // Step 2: Reverse every row
        for(int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;


            while(left < right) {

                int temp = matrix[i][left];

                matrix[i][left] = matrix[i][right];

                matrix[i][right] = temp;


                left++;
                right--;
            }
        }


        System.out.println("Rotated Matrix:");

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
