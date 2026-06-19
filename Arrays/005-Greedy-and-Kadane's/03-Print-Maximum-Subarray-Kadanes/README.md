# Print Maximum Sum Subarray

## Pattern

Kadane's Algorithm + Index Tracking

---

## Problem

Given an integer array, find the contiguous subarray that has the largest sum.

Print:

1. Maximum sum
2. The subarray itself

---

## Example

Input:

```
[-2,1,-3,4,-1,2,1,-5,4]
```

Output:

```
Maximum Sum = 6

Maximum Subarray:
4 -1 2 1
```

Explanation:

```
4 + (-1) + 2 + 1 = 6
```

---

## Brute Force

Generate every possible subarray.

Calculate every sum.

Example:

```
i = 0
    j = 0 to n-1

i = 1
    j = 1 to n-1
```

Time:

```
O(n²)
```

---

## Optimal Approach

Use Kadane's Algorithm.

Maintain:

```
sum = current subarray sum
maxSum = best sum found
```

Also maintain indices:

```
tempStart = possible starting index
start = final starting index
end = final ending index
```

---

## Algorithm

For every element:

1. Add element:

```
sum += arr[i]
```

2. If current sum is maximum:

Update:

```
maxSum
start
end
```

3. If sum becomes negative:

Discard it.

Start new subarray:

```
sum = 0
tempStart = i + 1
```

---

## Dry Run

Input:

```
[-2,1,-3,4,-1,2,1,-5,4]
```

Process:

```
-2
reset

1
best = 1

-3
reset

4,-1,2,1
sum = 6
best = 6
```

Subarray:

```
[4,-1,2,1]
```

---

## Why Reset When Sum < 0?

A negative prefix always decreases future sums.

Example:

```
[-10, 5]
```

Keeping:

```
-10 + 5 = -5
```

is worse than:

```
5
```

So start again.

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Only variables used:

```
O(1)
```

---

## Difference

### Maximum Sum Only

Store:

```
maxSum
```

---

### Print Subarray

Also store:

```
start
end
tempStart
```

---
