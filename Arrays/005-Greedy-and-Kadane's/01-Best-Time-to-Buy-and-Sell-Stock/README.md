# Best Time to Buy and Sell Stock

## Pattern

Prefix Minimum

---

## Problem

You are given an array:

```text
prices[i]
```

where `prices[i]` represents the stock price on the `i-th` day.

You want to maximize your profit by choosing:

- One day to buy a stock
- One later day to sell that stock

Return the maximum profit possible.

If no profit can be made, return:

```text
0
```

---

## Example 1

Input:

```text
prices = [7,1,5,3,6,4]
```

Output:

```text
5
```

Explanation:

```text
Buy at price 1
Sell at price 6

Profit = 6 - 1 = 5
```

---

## Example 2

Input:

```text
prices = [7,6,4,3,1]
```

Output:

```text
0
```

Explanation:

```text
Prices keep decreasing.
No profitable transaction exists.
```

---

## Brute Force Approach

Try every possible buy-sell pair.

```java
for(i = 0; i < n; i++) {
    for(j = i + 1; j < n; j++) {
        profit = prices[j] - prices[i];
    }
}
```

### Time Complexity

```text
O(n²)
```

### Space Complexity

```text
O(1)
```

Not efficient for large inputs.

---

## Optimal Approach

Maintain:

```text
Minimum stock price seen so far
```

For every day:

```text
profit = currentPrice - minimumPrice
```

Update the maximum profit.

---

## Algorithm

1. Initialize:

```java
minPrice = Integer.MAX_VALUE;
maxProfit = 0;
```

2. Traverse the array.

3. Update minimum price:

```java
minPrice = Math.min(minPrice, prices[i]);
```

4. Calculate profit:

```java
profit = prices[i] - minPrice;
```

5. Update maximum profit:

```java
maxProfit = Math.max(maxProfit, profit);
```

6. Return maximum profit.

---

## Dry Run

Input:

```text
[7,1,5,3,6,4]
```

| Price | Min Price | Profit | Max Profit |
|---------|---------|---------|---------|
| 7 | 7 | 0 | 0 |
| 1 | 1 | 0 | 0 |
| 5 | 1 | 4 | 4 |
| 3 | 1 | 2 | 4 |
| 6 | 1 | 5 | 5 |
| 4 | 1 | 3 | 5 |

Answer:

```text
5
```

---

## Key Observation

For every day:

```text
Best Buy Price = Minimum price seen before today
```

So we only need to keep track of one value:

```java
minPrice
```

instead of checking all previous days.

---

## Time Complexity

```text
O(n)
```

Single traversal.

---

## Space Complexity

```text
O(1)
```

No extra data structures used.

---
