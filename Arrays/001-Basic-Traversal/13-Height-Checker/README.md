# Height Checker

## Pattern

Sorting + Array Comparison

---

## Problem

A school wants students arranged in non-decreasing order of heights.

Return the number of indices where:

```
heights[i] != expected[i]
```

where `expected` is the sorted version of the heights array.

---

## Example 1

Input:

```
heights = [1,1,4,2,1,3]
```

Output:

```
3
```

Explanation:

Sorted array:

```
[1,1,1,2,3,4]
```

Differences occur at:

```
index 2
index 4
index 5
```

Total:

```
3
```

---

## Example 2

Input:

```
heights = [5,1,2,3,4]
```

Output:

```
4
```

---

## Example 3

Input:

```
heights = [1,2,3,4,5]
```

Output:

```
0
```

---

## Intuition

We need to know what the array should look like after sorting.

So:

1. Create a copy.
2. Sort the copy.
3. Compare both arrays.
4. Count mismatches.

---

## Algorithm

1. Copy the original array.
2. Sort the copied array.
3. Traverse both arrays.
4. If elements differ:
   ```
   count++
   ```
5. Return count.

---

## Dry Run

Input:

```
[1,1,4,2,1,3]
```

Sorted:

```
[1,1,1,2,3,4]
```

Compare:

```
1 = 1 ✓
1 = 1 ✓
4 ≠ 1 ✗
2 = 2 ✓
1 ≠ 3 ✗
3 ≠ 4 ✗
```

Answer:

```
3
```

---

## Time Complexity

Sorting:

```
O(n log n)
```

Comparison:

```
O(n)
```

Overall:

```
O(n log n)
```

---

## Space Complexity

Copied array:

```
O(n)
```

---

## Key Observation

The only thing that matters is whether each student is already standing in the position they would occupy in the sorted order.

---
