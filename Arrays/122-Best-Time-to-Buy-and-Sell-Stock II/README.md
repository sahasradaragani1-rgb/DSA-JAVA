**Best Time to Buy and Sell Stock II**
---
**Pattern**

Greedy

---
**Problem**

You are given an integer array `prices` where:
prices[i] represents the stock price on day `i`.
You may complete as many transactions as you like (buy one and sell one share multiple times).
Return the maximum profit you can achieve.

---
**Intuition**

Whenever the stock price increases from one day to the next, we can profit from that increase.
Instead of finding the overall buy and sell days, we simply capture every positive gain.
---
**Algorithm**

1. Initialize `maxProfit = 0`.
2. Traverse the array from index `1`.
3. If current price is greater than previous price:
   - Add the difference to `maxProfit`.
4. Return `maxProfit`.

---
***Time Complexity***

We traverse the array once.
for(int i = 1; i < n; i++)

Number of iterations:
n - 1 ≈ n

Work per iteration:
Comparison → O(1)
Addition → O(1)
Subtraction → O(1)

Therefore:
Time Complexity = O(n)

---
***Space Complexity***

No extra data structure is used.

Extra variables:
maxProfit
i
n

Therefore:
Space Complexity = O(1)
