# Intersection of Two Arrays

## Pattern

Hashing (HashSet)

---

## Problem

Given two integer arrays `nums1` and `nums2`, return an array of their intersection.

Each element in the result must be unique.

The order of the result does not matter.

---

## Example

Input:

```
nums1 = [1,2,2,1]
nums2 = [2,2]
```

Output:

```
[2]
```

Input:

```
nums1 = [4,9,5]
nums2 = [9,4,9,8,4]
```

Output:

```
[4,9]
```

---

## Intuition

We need to find elements that are present in both arrays.

A HashSet allows us to check whether an element exists in O(1) time.

1. Store all elements of the first array in a HashSet.
2. Traverse the second array.
3. If an element exists in the first set, add it to the result set.
4. The result set automatically removes duplicates.

---

## Algorithm

1. Create HashSet `set1`.
2. Insert all elements of `nums1` into `set1`.
3. Create HashSet `result`.
4. Traverse `nums2`.
5. If current element exists in `set1`, add it to `result`.
6. Print elements of `result`.

---

## Time Complexity

Building first HashSet:

```
O(n)
```

Traversing second array:

```
O(m)
```

Total:

```
O(n + m)
```

---

## Space Complexity

HashSet `set1` stores:

```
n elements
```

HashSet `result` stores:

```
up to min(n,m) elements
```

Therefore:

```
O(n + m)
```

---
