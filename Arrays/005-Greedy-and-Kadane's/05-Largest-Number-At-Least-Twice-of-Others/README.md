# Largest Number At Least Twice of Others

## Pattern

Array Traversal

---

## Problem

Given an integer array `nums`.

Find the index of the largest element such that:

```
largest >= 2 * every other element
```

If no such element exists, return:

```
-1
```

---

## Example 1

Input:

```
[3,6,1,0]
```

Output:

```
1
```

Explanation:

Largest:

```
6
```

Others:

```
3,1,0
```

Check:

```
6 >= 2*3
```

true.

---

## Example 2

Input:

```
[1,2,3,4]
```

Output:

```
-1
```

Explanation:

Largest:

```
4
```

Second largest:

```
3
```

Check:

```
4 >= 2*3
```

false.

---

## Brute Force

Find maximum.

For every other element check:

```
max >= 2 * nums[i]
```

Time:

```
O(n²)
```

---

## Optimal Idea

Only the second largest value matters.

Why?

If the largest is at least twice the second largest,
then it is automatically twice all smaller elements.

So find:

```
largest
second largest
```

in one traversal.

---

## Algorithm

Initialize:

```
max = -1
secondMax = -1
```

Traverse array:

If current element is greater than max:

```
secondMax = max
max = current
```

Else if greater than secondMax:

```
secondMax = current
```

Finally check:

```
max >= 2 * secondMax
```

---

## Dry Run

Input:

```
[3,6,1,0]
```

Traversal:

```
3
max=3

6
max=6
secondMax=3

1
secondMax=3

0
```

Check:

```
6 >= 2*3
```

true.

Answer:

```
index = 1
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

No extra data structure:

```
O(1)
```

---

## Key Observation

Do not sort.

Sorting gives:

```
O(n log n)
```

A single pass is enough.

---
