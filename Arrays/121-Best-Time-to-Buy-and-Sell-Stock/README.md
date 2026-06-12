**Best Time to Buy and Sell Stock**

**Pattern**

Running Minimum (Prefix Minimum)

**Problem**

You are given an array where:

prices[i]

represents the stock price on day i.

Choose:

One day to buy
One later day to sell

Return the maximum profit possible.

If no profit can be made, return 0.

**Intuition**

To maximize profit:

Profit = Selling Price - Buying Price

For every day, we need the smallest price seen before it.

Instead of checking all previous prices, keep track of:

minPrice

Whenever we encounter a new day:

Update minimum buying price.
Calculate profit if sold today.
Update maximum profit.
Algorithm
Initialize:
minPrice = prices[0]
maxProfit = 0
Traverse the array from left to right.
For each price:
Update minimum price seen so far.
Compute current profit.
Update maximum profit.
Return maximum profit.

**Time Complexity**

Loop runs once through the array.

for(int i = 1; i < n; i++)

Number of iterations:

n - 1 ≈ n

Work per iteration:

Comparison → O(1)
Subtraction → O(1)
Math.max() → O(1)

Therefore:

Time Complexity = O(n)
**Space Complexity**

Extra variables used:

minPrice
maxProfit
profit

No additional array or data structure is created.

Space Complexity = O(1)
