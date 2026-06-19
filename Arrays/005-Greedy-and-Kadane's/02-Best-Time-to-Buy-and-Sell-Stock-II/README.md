# Best Time to Buy and Sell Stock II

## Pattern

Greedy

---

## Problem

You are given an array:

```
prices[i]
```

where `prices[i]` represents the stock price on the `i-th` day.

You may complete as many transactions as you like.

Rules:

- Buy one stock.
- Sell one stock.
- You must sell before buying again.

Return the maximum profit.

---

## Example 1

Input:

```
[7,1,5,3,6,4]
```

Output:

```
7
```

Explanation:

```
Buy at 1
Sell at 5
Profit = 4

Buy at 3
Sell at 6
Profit = 3

Total Profit = 7
```

---

## Example 2

Input:

```
[1,2,3,4,5]
```

Output:

```
4
```

Explanation:

```
Buy at 1
Sell at 5

Profit = 4
```

---

## Example 3

Input:

```
[7,6,4,3,1]
```

Output:

```
0
```

No profitable transaction exists.

---

## Intuition

Whenever price increases:

```
prices[i] > prices[i-1]
```

we take that profit.

Every upward movement contributes to the final answer.

---

## Algorithm

1. Initialize:

```
profit = 0
```

2. Traverse array from index 1.

3. If:

```java
prices[i] > prices[i - 1]
```

add:

```java
prices[i] - prices[i - 1]
```

to profit.

4. Return profit.

---

## Dry Run

Input:

```
[7,1,5,3,6,4]
```

Process:

```
1 > 7 ? No

5 > 1 ? Yes
profit += 4

3 > 5 ? No

6 > 3 ? Yes
profit += 3

4 > 6 ? No
```

Total:

```
7
```

---

## Why Greedy Works?

Consider:

```
1 → 3 → 5
```

Profit:

```
5 - 1 = 4
```

Also:

```
(3 - 1) + (5 - 3)
= 2 + 2
= 4
```

Same result.

Therefore collecting every positive difference is optimal.

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Only one variable used:

```
O(1)
```

---

## Comparison

### Brute Force

Try all possible transactions.

```
Time: Exponential
```

Not feasible.

---

### Greedy

```
Time: O(n)
Space: O(1)
```

Optimal

---

## Key Observation

For unlimited transactions:

```java
if(prices[i] > prices[i - 1])
{
    profit += prices[i] - prices[i - 1];
}
```

Every increase can be safely added to the answer.

---
