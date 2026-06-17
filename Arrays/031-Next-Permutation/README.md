# Next Permutation

## Pattern

Greedy + Two Pointers

---

## Problem

Given an array representing a permutation of numbers, rearrange it into the next lexicographically greater permutation.

If no such permutation exists, rearrange it as the lowest possible order (ascending order).

---

## Example 1

Input:

```
[1,2,3]
```

Output:

```
[1,3,2]
```

---

## Example 2

Input:

```
[3,2,1]
```

Output:

```
[1,2,3]
```

---

## Example 3

Input:

```
[1,1,5]
```

Output:

```
[1,5,1]
```

---

## Intuition

To get the next permutation:

- Increase the number slightly.
- Make the increase as small as possible.

From the right side:

Find the first position where:

```
nums[i] < nums[i+1]
```

This position is called the breakpoint.

---

## Algorithm

### Step 1: Find Breakpoint

Traverse from right to left.

Find:

```java
nums[i] < nums[i+1]
```

Store index.

---

### Step 2: Find Next Greater Element

From the right side find:

```java
nums[j] > nums[index]
```

Swap them.

---

### Step 3: Reverse Remaining Part

The suffix is in descending order.

Reverse it to make it the smallest possible arrangement.

---

## Dry Run

Input:

```
[1,2,3]
```

Breakpoint:

```
1 < 2
index = 1
```

Swap:

```
2 ↔ 3
```

Array:

```
[1,3,2]
```

Reverse suffix:

```
[1,3,2]
```

Final Answer:

```
[1,3,2]
```

---

## Dry Run 2

Input:

```
[3,2,1]
```

Breakpoint:

```
Not found
```

Reverse whole array:

```
[1,2,3]
```

Final Answer:

```
[1,2,3]
```

---

## Time Complexity

Finding breakpoint:

```
O(n)
```

Finding next greater element:

```
O(n)
```

Reversing suffix:

```
O(n)
```

Total:

```
O(n)
```

---

## Space Complexity

Only a few variables are used.

```
Space Complexity = O(1)
```

---

## Key Observation

The suffix after the breakpoint is always in decreasing order.

After swapping, reversing that suffix produces the smallest possible larger permutation.

---
