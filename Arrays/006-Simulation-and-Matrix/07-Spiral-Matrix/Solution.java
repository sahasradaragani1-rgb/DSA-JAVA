/*
LeetCode 54: Spiral Matrix

Approach:
Use four boundaries:
top, bottom, left, right

Traverse:
1. Left -> Right
2. Top -> Bottom
3. Right -> Left
4. Bottom -> Top

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


        int top = 0;
        int bottom = m - 1;

        int left = 0;
        int right = n - 1;



        while(top <= bottom && left <= right) {


            // left to right
            for(int j = left; j <= right; j++) {

                ans.add(matrix[top][j]);
            }

            top++;



            // top to bottom
            for(int i = top; i <= bottom; i++) {

                ans.add(matrix[i][right]);
            }

            right--;



            // right to left
            if(top <= bottom) {

                for(int j = right; j >= left; j--) {

                    ans.add(matrix[bottom][j]);
                }

                bottom--;
            }



            // bottom to top
            if(left <= right) {

                for(int i = bottom; i >= top; i--) {

                    ans.add(matrix[i][left]);
                }

                left++;
            }
        }


        System.out.println("Spiral Order:");

        for(int x : ans) {

            System.out.print(x + " ");
        }
    }
}
