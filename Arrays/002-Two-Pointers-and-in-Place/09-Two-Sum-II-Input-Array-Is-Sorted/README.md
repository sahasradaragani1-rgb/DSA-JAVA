# Two Sum II - Input Array Is Sorted

## Pattern

Two Pointer

---

## Problem

Given a sorted array, find two numbers such that:

```
numbers[i] + numbers[j] = target
```

Return their indices.

Indices are 1-based.

---

## Example

Input:

```
numbers = [2,7,11,15]
target = 9
```

Output:

```
[1,2]
```

Explanation:

```
2 + 7 = 9
```

---

## Intuition

Since the array is sorted:

Small numbers are on the left.
Large numbers are on the right.

Use two pointers:

```
left = 0
right = n-1
```

---

## Algorithm

1. Calculate:

```
sum = numbers[left] + numbers[right]
```

2. If:

```
sum == target
```

answer found.

3. If:

```
sum < target
```

Need a bigger number:

```
left++
```

4. If:

```
sum > target
```

Need a smaller number:

```
right--
```

---

## Dry Run

Input:

```
[2,7,11,15]
target = 9
```

Start:

```
L        R
2 7 11 15
```

Sum:

```
2 + 15 = 17
```

Too large:

```
R--
```

Now:

```
2 + 11 = 13
```

Too large:

```
R--
```

Now:

```
2 + 7 = 9
```

Found:

```
[1,2]
```

---

## Time Complexity

Each pointer moves at most n times.

```
O(n)
```

---

## Space Complexity

No extra data structure.

```
O(1)
```

---

## Why Not HashMap?

HashMap gives:

```
O(n) time
O(n) space
```

But because array is sorted, two pointers are better:

```
O(n) time
O(1) space
```

---
