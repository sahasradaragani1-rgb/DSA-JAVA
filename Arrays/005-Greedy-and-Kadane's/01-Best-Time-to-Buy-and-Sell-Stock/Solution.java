/*
LeetCode 121: Best Time to Buy and Sell Stock

Approach:
Keep track of minimum price seen so far.
For every day, calculate possible profit.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] prices = new int[n];

        for(int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {

            minPrice = Math.min(minPrice, price);

            int profit = price - minPrice;

            maxProfit = Math.max(maxProfit, profit);
        }

        System.out.println(maxProfit);
    }
}
