# Check if Array is Sorted

## Pattern

Array Traversal

---

## Problem

Given an integer array `arr`, check whether it is sorted in **non-decreasing order**.

Return `true` if sorted, otherwise `false`.

---

## Example

Input:

```
arr = [1, 2, 3, 4, 5]
```

Output:

```
true
```

Input:

```
arr = [1, 3, 2, 4]
```

Output:

```
false
```

---

## Intuition

A sorted array must satisfy:

```
arr[i] ≤ arr[i+1]
```

for all valid indices.

If even one violation exists, the array is not sorted.

---

## Algorithm

1. Assume array is sorted → `sorted = true`
2. Traverse from index `0` to `n-2`
3. If `arr[i] > arr[i+1]`:
   - Set `sorted = false`
   - Break loop
4. Print result

---

## Dry Run

Input:

```
[1, 2, 3, 4]
```

Checks:

```
1 ≤ 2 ✔
2 ≤ 3 ✔
3 ≤ 4 ✔
```

Output:

```
true
```

---

Input:

```
[1, 3, 2, 4]
```

Checks:

```
1 ≤ 3 ✔
3 ≤ 2 ✘ → break
```

Output:

```
false
```

---

## Time Complexity

We traverse the array once.

```
n - 1 comparisons
```

Therefore:

```
Time Complexity = O(n)
```

---

## Space Complexity

Only one variable is used:

- `sorted`

Therefore:

```
Space Complexity = O(1)
```

---

## Key Observation

A sorted array must have no "break point" where:

```
arr[i] > arr[i+1]
```

Even a single violation is enough to reject it.

---
