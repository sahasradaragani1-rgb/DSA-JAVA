# Minimum Size Subarray Sum

## Pattern

Sliding Window

---

## Problem

Given an array of positive integers `nums`
and a positive integer `target`.

Return the minimum length of a subarray
whose sum is greater than or equal to `target`.

If no such subarray exists:

```text
return 0
```

---

## Example 1

Input:

```text
target = 7
nums = [2,3,1,2,4,3]
```

Output:

```text
2
```

Explanation:

```text
[4,3]
```

Sum:

```text
7
```

Length:

```text
2
```

---

## Example 2

Input:

```text
target = 4
nums = [1,4,4]
```

Output:

```text
1
```

---

## Example 3

Input:

```text
target = 11
nums = [1,1,1,1,1,1,1,1]
```

Output:

```text
0
```

---

## Intuition

All elements are positive.

Therefore:

```text
Expand window → sum increases
Shrink window → sum decreases
```

This monotonic property makes
Sliding Window possible.

---

## Algorithm

1. Expand window using `right`.

```java
sum += nums[right];
```

2. When:

```java
sum >= target
```

try shrinking from left.

3. Update minimum length.

```java
minLen = Math.min(minLen,
                  right-left+1);
```

4. Continue until array ends.

---

## Dry Run

Input:

```text
target = 7
nums = [2,3,1,2,4,3]
```

Window:

```text
[2,3,1,2]
sum = 8
```

Valid.

Length:

```text
4
```

Shrink:

```text
[3,1,2]
sum = 6
```

Not valid.

Expand:

```text
[3,1,2,4]
sum = 10
```

Shrink repeatedly:

```text
[4,3]
sum = 7
```

Length:

```text
2
```

Answer:

```text
2
```

---

## Why Sliding Window Works?

Because all numbers are positive.

Once:

```text
sum >= target
```

Removing elements from left can only decrease sum.

So every valid window is processed exactly once.

---

## Time Complexity

Each element enters window once.

Each element leaves window once.

```text
O(n)
```

---

## Space Complexity

```text
O(1)
```

---

## Important Observation

This problem asks:

```text
Minimum Length
```

So whenever a valid window appears:

```text
Immediately try shrinking it
```

to get an even smaller answer.

---
