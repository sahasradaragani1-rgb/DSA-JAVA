# Largest Element in Array

## Pattern

Array Traversal

---

## Problem

Given an array of integers, find the largest element present in the array.

---

## Example

Input:

```
arr = [10, 25, 7, 89, 45]
```

Output:

```
89
```

---

## Intuition

The largest element must be greater than or equal to every other element.

While traversing the array, keep updating the maximum value whenever a larger element is found.

---

## Algorithm

1. Initialize:

```java
largest = arr[0];
```

2. Traverse the array from index 1.
3. If current element is greater than `largest`:
   - Update `largest`.
4. Print `largest`.

---

## Dry Run

Input:

```
arr = [10, 25, 7, 89, 45]
```

Initial:

```
largest = 10
```

Iteration 1:

```
25 > 10
largest = 25
```

Iteration 2:

```
7 > 25
No
```

Iteration 3:

```
89 > 25
largest = 89
```

Iteration 4:

```
45 > 89
No
```

Final Answer:

```
89
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

Only one extra variable is used:

```java
largest
```

Therefore:

```
Space Complexity = O(1)
```

---

## Key Observation

To know the largest element, every element must be checked at least once.

Therefore:

```
Lower Bound = O(n)
```

Since our solution also runs in:

```
O(n)
```

it is optimal.

---
