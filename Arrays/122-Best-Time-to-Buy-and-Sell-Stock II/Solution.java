/*
LeetCode 122: Best Time to Buy and Sell Stock II

Approach:
Add every positive price difference between consecutive days.

Time Complexity: O(n)
Space Complexity: O(1) Auxiliary Space
*/

import java.util.*;
public class buysellstock2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int maxProfit = 0;
        int n = in.nextInt();
        int prices[] = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }

        for (int i = 1; i < n; i++) {

            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        System.out.println(maxProfit);
    }
}
