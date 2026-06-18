# Find Pivot Index

## Pattern

Prefix Sum

---

## Problem

Given an array of integers, find the pivot index.

A pivot index is an index where:

```text
Sum of elements on left
=
Sum of elements on right
```

Return the leftmost pivot index.

If none exists, return:

```text
-1
```

---

## Example 1

Input:

```text
[1,7,3,6,5,6]
```

Output:

```text
3
```

Explanation:

```text
Left Sum  = 1+7+3 = 11
Right Sum = 5+6   = 11
```

---

## Example 2

Input:

```text
[1,2,3]
```

Output:

```text
-1
```

---

## Example 3

Input:

```text
[2,1,-1]
```

Output:

```text
0
```

Explanation:

```text
Left Sum  = 0
Right Sum = 1 + (-1) = 0
```

---

## Intuition

Brute Force:

For every index:

```text
Calculate left sum
Calculate right sum
```

This takes:

```text
O(n²)
```

Instead:

Calculate total sum once.

Then maintain left sum while traversing.

Right sum can be computed instantly.

---

## Algorithm

1. Find total sum.

2. Initialize:

```java
leftSum = 0;
```

3. Traverse array.

4. Compute:

```java
rightSum = totalSum - leftSum - nums[i];
```

5. If:

```java
leftSum == rightSum
```

return current index.

6. Update:

```java
leftSum += nums[i];
```

---

## Dry Run

Input:

```text
[1,7,3,6,5,6]
```

Total:

```text
28
```

Index 0:

```text
Left = 0
Right = 27
```

Not pivot.

Index 1:

```text
Left = 1
Right = 20
```

Not pivot.

Index 2:

```text
Left = 8
Right = 17
```

Not pivot.

Index 3:

```text
Left = 11
Right = 11
```

Pivot found.

Answer:

```text
3
```

---

## Time Complexity

Total sum:

```text
O(n)
```

Traversal:

```text
O(n)
```

Overall:

```text
O(n)
```

---

## Space Complexity

Only variables used:

```text
O(1)
```

---

## Key Observation

For every index:

```java
rightSum = totalSum - leftSum - nums[i]
```

So we never need to recalculate sums.

---
