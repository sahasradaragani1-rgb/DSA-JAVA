/*
Pascal's Triangle

Approach:
Build triangle row by row.

Each element:
triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j]

Time Complexity: O(n²)
Space Complexity: O(n²)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = in.nextInt();


        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();


        for(int i = 0; i < n; i++) {

            ArrayList<Integer> row = new ArrayList<>();


            for(int j = 0; j <= i; j++) {

                // first and last elements are always 1
                if(j == 0 || j == i) {

                    row.add(1);
                }

                else {

                    int value = triangle.get(i-1).get(j-1)
                              + triangle.get(i-1).get(j);

                    row.add(value);
                }
            }

            triangle.add(row);
        }


        for(ArrayList<Integer> row : triangle) {

            System.out.println(row);
        }
    }
}
