/*
Print Subarray With Maximum Sum

Approach:
Modified Kadane's Algorithm.

Along with maximum sum,
store starting and ending indices.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }


        int sum = 0;
        int maxSum = Integer.MIN_VALUE;


        int start = 0;
        int end = 0;
        int tempStart = 0;


        for(int i = 0; i < n; i++) {

            sum += arr[i];


            if(sum > maxSum) {

                maxSum = sum;

                start = tempStart;
                end = i;
            }


            if(sum < 0) {

                sum = 0;

                tempStart = i + 1;
            }
        }


        System.out.println("Maximum Sum = " + maxSum);

        System.out.println("Maximum Subarray:");

        for(int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
