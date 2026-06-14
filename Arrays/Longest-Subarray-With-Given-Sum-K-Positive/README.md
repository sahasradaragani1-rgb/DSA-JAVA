# Longest Subarray With Given Sum K (Positive Numbers)

## Pattern

Sliding Window / Two Pointers

---

## Problem

Given an array of positive integers and an integer `k`, find the length of the longest subarray whose sum equals `k`.

---

## Example

Input:

```
arr = [1,2,1,1,1,3,2]
k = 5
```

Output:

```
4
```

Explanation:

```
[2,1,1,1]
```

Sum = 5

Length = 4

---

## Intuition

Since all numbers are positive:

- Adding elements increases the sum.
- Removing elements decreases the sum.

This property allows us to use a sliding window.

---

## Algorithm

1. Initialize:
   - left = 0
   - sum = 0
   - maxLen = 0

2. Expand the window using `right`.

3. While sum > k:
   - Remove elements from the left.

4. If sum == k:
   - Update maximum length.

5. Continue until end of array.

---

## Dry Run

Input:

```
arr = [1,2,1,1,1,3,2]
k = 5
```

Window Expansion:

```
[1] → sum = 1
[1,2] → sum = 3
[1,2,1] → sum = 4
[1,2,1,1] → sum = 5
```

Length:

```
4
```

Continue:

```
[2,1,1,1] → sum = 5
```

Length:

```
4
```

Maximum:

```
4
```

---

## Time Complexity

Each element enters the window once.

Each element leaves the window once.

Therefore:

```
Time Complexity = O(n)
```

---

## Space Complexity

Only variables are used:

- left
- right
- sum
- maxLen

Therefore:

```
Space Complexity = O(1)
```

---

## Key Observation

Sliding Window works because all elements are positive.

When:

```
sum > k
```

moving `left` forward always decreases the sum.

This property fails when negative numbers are present.

---
