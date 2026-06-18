# Union of Two Sorted Arrays

## Pattern

Two Pointers

---

## Problem

Given two sorted arrays, return their union.

The union should contain all distinct elements present in either array.

---

## Example

Input:

```
arr1 = [1,2,2,3,4]
arr2 = [2,3,5]
```

Output:

```
[1,2,3,4,5]
```

---

## Intuition

Since both arrays are already sorted:

- Use two pointers.
- Compare current elements.
- Add the smaller element.
- Skip duplicates.

This avoids using a HashSet and preserves sorted order.

---

## Algorithm

1. Initialize pointers `i` and `j`.
2. Compare `arr1[i]` and `arr2[j]`.
3. Add the smaller element if not already added.
4. Move the corresponding pointer.
5. Process remaining elements.
6. Print the union.

---

## Dry Run

Input:

```
arr1 = [1,2,2,3,4]
arr2 = [2,3,5]
```

Step-by-step:

```
1 → add
2 → add
2 → skip duplicate
3 → add
4 → add
5 → add
```

Result:

```
[1,2,3,4,5]
```

---

## Time Complexity

Each element is visited at most once.

```
O(n + m)
```

where:

- n = size of first array
- m = size of second array

---

## Space Complexity

Result array stores union elements.

```
O(n + m)
```

---

## Key Observation

Because the arrays are sorted, we can use the merge-step idea from Merge Sort.

Without sorting information:

```
O((n+m) log(n+m))
```

or HashSet-based solutions are needed.

With sorted arrays:

```
O(n + m)
```

which is optimal.

---
