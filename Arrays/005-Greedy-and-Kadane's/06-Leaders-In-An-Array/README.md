# Leaders in an Array

## Pattern

Right Traversal / Suffix Maximum

---

## Problem

An element is called a leader if it is greater than or equal to all elements to its right.

The last element is always a leader.

Find all leaders in the array.

---

## Example 1

Input:

```
[16,17,4,3,5,2]
```

Output:

```
17 5 2
```

Explanation:

For 17:

```
17 > 4,3,5,2
```

For 5:

```
5 > 2
```

For 2:

No elements on right.

---

## Example 2

Input:

```
[1,2,3,4,5]
```

Output:

```
5
```

Only the last element is leader.

---

## Brute Force Approach

For every element:

Check all elements on its right.

Time:

```
O(n²)
```

Space:

```
O(1)
```

---

## Optimal Idea

Start from the right.

Maintain:

```
maximum element seen so far
```

If:

```
current >= maximum
```

then current element is a leader.

---

## Algorithm

1. Initialize:

```
maxRight = -∞
```

2. Traverse from:

```
n-1 to 0
```

3. Check:

```
arr[i] >= maxRight
```

4. If true:

Store it and update:

```
maxRight = arr[i]
```

5. Reverse answer because we collected from right.

---

## Dry Run

Input:

```
[16,17,4,3,5,2]
```

Start:

```
maxRight = -∞
```

From right:

```
2  -> leader
5  -> leader
3  -> no
4  -> no
17 -> leader
16 -> no
```

Collected:

```
2 5 17
```

Reverse:

```
17 5 2
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

ArrayList stores leaders:

```
O(n)
```

---

## Key Observation

The right side maximum decides whether an element is a leader.

So:

```
Traverse from right
```

instead of checking every element.

---
