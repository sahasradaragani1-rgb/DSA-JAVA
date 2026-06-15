# Kadane's Algorithm (Maximum Subarray)

## Pattern

Greedy + Array Traversal

---

## Problem

Given an integer array `nums`, find the contiguous subarray with the largest sum and return that sum.

---

## Example 1

Input:

```
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

Output:

```
6
```

Explanation:

```
[4,-1,2,1]
```

Sum:

```
6
```

---

## Example 2

Input:

```
nums = [1]
```

Output:

```
1
```

---

## Example 3

Input:

```
nums = [5,4,-1,7,8]
```

Output:

```
23
```

---

## Intuition

A negative running sum can never help a future subarray.

If:

```
currentSum < 0
```

discard it and start fresh.

This is the core idea behind Kadane's Algorithm.

---

## Algorithm

1. Initialize:

```java
sum = 0
maxSum = Integer.MIN_VALUE
```

2. Traverse the array.

3. Add current element to sum.

4. Update:

```java
maxSum = Math.max(maxSum, sum)
```

5. If:

```java
sum < 0
```

reset:

```java
sum = 0
```

6. Return maxSum.

---

## Dry Run

Input:

```
[-2,1,-3,4,-1,2,1,-5,4]
```

| Element | Running Sum | Max Sum |
|----------|-------------|----------|
| -2 | -2 | -2 |
| 1 | 1 | 1 |
| -3 | -2 | 1 |
| 4 | 4 | 4 |
| -1 | 3 | 4 |
| 2 | 5 | 5 |
| 1 | 6 | 6 |
| -5 | 1 | 6 |
| 4 | 5 | 6 |

Final Answer:

```
6
```

---

## Why Kadane Works

Suppose:

```text
Current Sum = -10
Next Element = 5
```

Keeping the negative sum:

```text
-10 + 5 = -5
```

Starting fresh:

```text
5
```

Clearly better.

Therefore:

```text
Negative Prefix = Useless
```

Discard it.

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Only two variables:

```java
sum
maxSum
```

Therefore:

```
O(1)
```

---

## Comparison

### Brute Force

Generate all subarrays:

```
O(n²)
```

or

```
O(n³)
```

---

### Kadane's Algorithm

```
Time Complexity = O(n)
Space Complexity = O(1)
```

Optimal

---

## Key Observation

If a prefix contributes a negative sum, it can never improve any future subarray.

So we reset the running sum whenever it becomes negative.

---
