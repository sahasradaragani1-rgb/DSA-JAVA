# Linear Search

## Pattern

Array Traversal

---

## Problem

Given an array and a target element, find the index of the target.

If the target is not present, return `-1`.

---

## Example

Input:

```
arr = [10, 25, 30, 45, 50]
target = 30
```

Output:

```
2
```

---

## Intuition

Check each element one by one.

If the current element matches the target, return its index immediately.

---

## Algorithm

1. Traverse the array from left to right.
2. Compare each element with the target.
3. If a match is found:
   - Return the index.
4. If traversal completes:
   - Return `-1`.

---

## Dry Run

Input:

```
arr = [10, 25, 30, 45, 50]
target = 30
```

Checks:

```
10 == 30 → No
25 == 30 → No
30 == 30 → Yes
```

Index:

```
2
```

Output:

```
2
```

---

## Time Complexity

### Best Case

Target found at first position.

```
O(1)
```

### Worst Case

Target found at last position or not present.

```
n comparisons
```

Therefore:

```
O(n)
```

---

## Space Complexity

No extra data structure is used.

```
O(1)
```

---

## Key Observation

Linear Search works on:

- Sorted arrays
- Unsorted arrays

Unlike Binary Search, it does not require the array to be sorted.

---
