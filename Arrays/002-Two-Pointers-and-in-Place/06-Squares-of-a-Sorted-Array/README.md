# Squares of a Sorted Array

## Pattern

Two Pointer

---

## Problem

Given a non-decreasing sorted array, return an array of the squares of each number also sorted.

---

## Example

Input:

```
[-4,-1,0,3,10]
```

Output:

```
[0,1,9,16,100]
```

---

## Intuition

The array is already sorted, but negative numbers create a problem.

Example:

```
[-7,-3,2,5]
```

Squares:

```
[49,9,4,25]
```

Largest squares can only come from:

- left side (large negative)
- right side (large positive)

So compare both ends.

---

## Algorithm

1. Create result array.
2. Use two pointers:

```
left = 0
right = n-1
```

3. Compare:

```
nums[left]^2
nums[right]^2
```

4. Put the larger square at the end.
5. Move the pointer.
6. Continue until pointers meet.

---

## Dry Run

Input:

```
[-4,-1,0,3,10]
```

Start:

```
left = -4
right = 10
```

Compare:

```
16 vs 100
```

Place:

```
100
```

Next:

```
16 vs 9
```

Place:

```
16
```

Result:

```
[0,1,9,16,100]
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Extra result array:

```
O(n)
```

---

## Key Observation

The biggest square is always at one of the two ends.

---
