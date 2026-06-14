# Move Zeroes

## Pattern

Two Pointers

---

## Problem

Given an integer array `nums`, move all `0`s to the end while maintaining the relative order of the non-zero elements.

You must do this in-place without making a copy of the array.

---

## Example

Input:

```
nums = [0,1,0,3,12]
```

Output:

```
[1,3,12,0,0]
```

Input:

```
nums = [0]
```

Output:

```
[0]
```

---

## Intuition

We want all non-zero elements to appear first in their original order.

Use a pointer `k` to track where the next non-zero element should be placed.

First:

- Copy all non-zero elements to the front.

Then:

- Fill the remaining positions with zeroes.

---

## Algorithm

1. Initialize `k = 0`.
2. Traverse the array.
3. If current element is non-zero:
   - Place it at index `k`.
   - Increment `k`.
4. After traversal, fill remaining positions with zeroes.
5. Print the modified array.

---

## Dry Run

Input:

```
nums = [0,1,0,3,12]
```

Initial:

```
k = 0
```

Process non-zero elements:

```
1 → nums[0]
3 → nums[1]
12 → nums[2]
```

Array becomes:

```
[1,3,12,3,12]
```

Current:

```
k = 3
```

Fill remaining positions with zeroes:

```
[1,3,12,0,0]
```

Final Answer:

```
[1,3,12,0,0]
```

---

## Time Complexity

First traversal:

```
O(n)
```

Second traversal (filling zeroes):

```
O(n)
```

Total:

```
O(n) + O(n)
```

Ignoring constants:

```
Time Complexity = O(n)
```

---

## Space Complexity

Only one extra variable is used:

```java
k
```

No additional array is created.

```
Space Complexity = O(1)
```

---

## Key Observation

Instead of repeatedly swapping zeroes:

```
O(n²)
```

we compact all non-zero elements first and then fill the remaining positions with zeroes.

This achieves:

```
O(n)
```

with constant extra space.

---
