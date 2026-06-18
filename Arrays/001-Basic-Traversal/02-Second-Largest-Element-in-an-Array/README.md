# Second Largest Element in Array

## Pattern

Array Traversal

---

## Problem

Given an array of integers, find the second largest distinct element in the array.

If no second largest element exists, print an appropriate message.

---

## Example

Input:

```
arr = [12, 35, 1, 10, 34, 1]
```

Output:

```
34
```

Input:

```
arr = [10, 10, 10]
```

Output:

```
No Second Largest Element
```

---

## Intuition

Keep track of:

- Largest element seen so far
- Second largest element seen so far

Whenever a larger element is found:

- Current largest becomes second largest
- New value becomes largest

---

## Algorithm

1. Initialize:

```java
largest = Integer.MIN_VALUE
secondLargest = Integer.MIN_VALUE
```

2. Traverse the array.
3. If current element is greater than largest:
   - Update secondLargest = largest
   - Update largest
4. Else if current element is greater than secondLargest and not equal to largest:
   - Update secondLargest
5. Print secondLargest.

---

## Dry Run

Input:

```
arr = [12, 35, 1, 10, 34, 1]
```

Initial:

```
largest = -∞
secondLargest = -∞
```

| Element | Largest | Second Largest |
|----------|----------|---------------|
| 12 | 12 | -∞ |
| 35 | 35 | 12 |
| 1 | 35 | 12 |
| 10 | 35 | 12 |
| 34 | 35 | 34 |
| 1 | 35 | 34 |

Final Answer:

```
34
```

---

## Time Complexity

We traverse the array once.

```
n iterations
```

Work per iteration:

```
Comparisons → O(1)
Assignments → O(1)
```

Therefore:

```
Time Complexity = O(n)
```

---

## Space Complexity

Only two extra variables are used:

```java
largest
secondLargest
```

Therefore:

```
Space Complexity = O(1)
```

---

## Key Observation

Sorting the array would take:

```
O(n log n)
```

But we only need the second largest element, not the entire sorted array.

By maintaining two variables, we achieve:

```
O(n)
```

which is optimal.

---
