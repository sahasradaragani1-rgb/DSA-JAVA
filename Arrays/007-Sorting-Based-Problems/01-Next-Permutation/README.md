# Next Permutation

## Pattern

Array Manipulation / Greedy

---

## Problem

Given an array representing a permutation.

Find the next lexicographically greater permutation.

If no next permutation exists, return the smallest permutation.

---

## Example 1

Input:

```
1 2 3
```

Output:

```
1 3 2
```

---

## Example 2

Input:

```
3 2 1
```

Output:

```
1 2 3
```

Because it is already the largest permutation.

---

## Observation

A permutation changes from right side.

Example:

```
1 2 7 4 3 1
```

The increasing part from right:

```
7 4 3 1
```

is already the highest possible.

We need to increase the number before it.

---

## Algorithm

### Step 1: Find breakpoint

Find first index from right where:

```
nums[i] < nums[i+1]
```

Example:

```
1 2 7 4 3 1
  ^
break
```

---

### Step 2: Find next greater element

From right side find element greater than:

```
nums[i]
```

Swap them.

---

### Step 3: Reverse remaining part

The right side is decreasing.

Reverse it to get the smallest possible order.

---

## Dry Run

Input:

```
1 2 3
```

Find breakpoint:

```
2 < 3
```

Swap:

```
1 3 2
```

Reverse remaining:

```
1 3 2
```

Answer:

```
1 3 2
```

---

## Why Reverse?

After swapping, the suffix is still in decreasing order.

We need the smallest suffix:

```
ascending order
```

Reversing gives that.

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

In-place:

```
O(1)
```

---
