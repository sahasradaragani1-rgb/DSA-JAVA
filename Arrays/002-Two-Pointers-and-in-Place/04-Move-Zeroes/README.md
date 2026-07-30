# Move Zeroes

## Problem

Given an integer array `nums`, move all `0`s to the end of the array while maintaining the relative order of the non-zero elements.

The operation must be performed **in-place** without creating another array.

---

## Example

### Input

```text
[0, 1, 0, 3, 12]
```

### Output

```text
[1, 3, 12, 0, 0]
```

---

## Approach

Use the **Two Pointer Technique**.

Maintain a pointer `j` that represents the position where the next non-zero element should be placed.

Traverse the array using pointer `i`:

1. If `nums[i]` is non-zero, swap `nums[i]` with `nums[j]`.
2. Increment `j`.
3. Continue until the entire array is processed.

This moves all non-zero elements to the front while preserving their relative order. The remaining positions automatically contain zeroes.

---

## Algorithm

1. Initialize `j = 0`.
2. Traverse the array from left to right using `i`.
3. If `nums[i] != 0`:

   * Swap `nums[i]` and `nums[j]`.
   * Increment `j`.
4. Print the modified array.

---

## Dry Run

Input:

```text
[0, 1, 0, 3, 12]
```

After processing:

```text
[1, 0, 0, 3, 12]
```

```text
[1, 3, 0, 0, 12]
```

```text
[1, 3, 12, 0, 0]
```

Final result:

```text
[1, 3, 12, 0, 0]
```

---

## Complexity Analysis

### Time Complexity

```text
O(n)
```

The array is traversed once.

### Space Complexity

```text
O(1)
```

The array is modified in-place using only constant extra space.

---

## Key Pattern

```text
Two Pointers
+
In-place Array Modification
```

This problem is a classic example of the **Two Pointer Technique** and is useful for problems involving:

* Moving elements
* Removing elements in-place
* Maintaining relative order
* Partitioning arrays

---
