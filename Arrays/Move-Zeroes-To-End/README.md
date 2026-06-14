# Move Zeroes To End

## Pattern

Two Pointers

---

## Problem

Given an array, move all zeroes to the end while maintaining the relative order of the non-zero elements.

The operation must be performed in-place.

---

## Example

Input:

```
arr = [1,0,2,0,3,4]
```

Output:

```
[1,2,3,4,0,0]
```

---

## Intuition

We want all non-zero elements to stay in their original order.

Use a pointer `k` to indicate where the next non-zero element should be placed.

After placing all non-zero elements, fill the remaining positions with zeroes.

---

## Algorithm

1. Initialize `k = 0`.
2. Traverse the array.
3. If current element is non-zero:
   - Place it at index `k`.
   - Increment `k`.
4. Fill remaining positions with zeroes.
5. Print the array.

---

## Dry Run

Input:

```
[1,0,2,0,3,4]
```

After placing non-zero elements:

```
[1,2,3,4,3,4]
```

Current:

```
k = 4
```

Fill remaining positions with zeroes:

```
[1,2,3,4,0,0]
```

Final Answer:

```
[1,2,3,4,0,0]
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

Overall:

```
O(n)
```

---

## Space Complexity

Only one extra variable is used:

```java
k
```

Therefore:

```
O(1)
```

---

## Key Observation

A brute-force approach repeatedly swapping zeroes can take:

```
O(n²)
```

Using the two-pointer technique allows us to solve it in:

```
O(n)
```

while preserving the order of non-zero elements.

---
