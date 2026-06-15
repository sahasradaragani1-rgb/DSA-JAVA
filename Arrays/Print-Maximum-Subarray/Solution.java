/*
Print Subarray With Maximum Sum

Approach:
Extended Kadane's Algorithm

Track:
1. Current starting index
2. Best starting index
3. Best ending index

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

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;

        for (int i = 0; i < n; i++) {

            if (sum == 0) {
                start = i;
            }

            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);

        System.out.print("Subarray: ");

        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
