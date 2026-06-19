/*
LeetCode 122: Best Time to Buy and Sell Stock II

Approach:
Take every profitable transaction.

If today's price is greater than yesterday's,
add the difference to profit.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = in.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter stock prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }

        int profit = 0;

        for (int i = 1; i < n; i++) {

            if (prices[i] > prices[i - 1]) {

                profit += prices[i] - prices[i - 1];
            }
        }

        System.out.println("Maximum Profit = " + profit);
    }
}
