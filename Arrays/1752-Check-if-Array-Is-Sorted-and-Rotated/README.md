# Check if Array Is Sorted and Rotated

## Pattern

Array Traversal

---

## Problem

Given an array `nums`, return `true` if the array was originally sorted in non-decreasing order and then rotated some number of positions.

Otherwise, return `false`.

---

## Example

Input:

```
nums = [3,4,5,1,2]
```

Output:

```
true
```

Input:

```
nums = [2,1,3,4]
```

Output:

```
false
```

---

## Intuition

In a sorted array:

```
1 2 3 4 5
```

every element is less than or equal to the next.

After rotation:

```
3 4 5 1 2
```

there is only one position where:

```
current > next
```

which is:

```
5 > 1
```

If there is more than one such position, the array cannot be sorted and rotated.

---

## Algorithm

1. Initialize `count = 0`.
2. Traverse the array.
3. Check:

```java
nums[i] > nums[(i + 1) % n]
```

4. If true, increment `count`.
5. If `count > 1`, return false.
6. Otherwise return true.

---

## Dry Run

Input:

```
[3,4,5,1,2]
```

Comparisons:

```
3 > 4 → No
4 > 5 → No
5 > 1 → Yes
1 > 2 → No
2 > 3 → No
```

Count:

```
1
```

Output:

```
true
```

---

## Dry Run 2

Input:

```
[2,1,3,4]
```

Comparisons:

```
2 > 1 → Yes
1 > 3 → No
3 > 4 → No
4 > 2 → Yes
```

Count:

```
2
```

Output:

```
false
```

---

## Time Complexity

We traverse the array once.

```
n iterations
```

Work per iteration:

```
Comparison → O(1)
```

Therefore:

```
Time Complexity = O(n)
```

---

## Space Complexity

Only one variable is used:

```java
count
```

Therefore:

```
Space Complexity = O(1)
```

---

## Key Observation

A sorted and rotated array can have at most one "drop":

```
nums[i] > nums[i+1]
```

More than one drop means the array cannot be formed by rotating a sorted array.

---
