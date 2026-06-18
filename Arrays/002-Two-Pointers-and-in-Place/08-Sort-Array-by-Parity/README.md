# Sort Array by Parity

## Pattern

Two Pointer

---

## Problem

Given an integer array, move all even numbers before odd numbers.

The relative order does not matter.

---

## Example

Input:

```
[3,1,2,4]
```

Output:

```
[4,2,1,3]
```

or

```
[2,4,3,1]
```

Both are valid.

---

## Intuition

We need:

```
Even numbers → Left
Odd numbers  → Right
```

Use two pointers.

```
left  = start
right = end
```

---

## Algorithm

1. Start two pointers.

2. If left element is even:

```
left++
```

because it is already correct.

3. If right element is odd:

```
right--
```

because it is already correct.

4. Otherwise:

Swap them.

---

## Dry Run

Input:

```
[3,1,2,4]
```

Pointers:

```
L       R
3 1 2 4
```

3 is odd and 4 is even.

Swap:

```
4 1 2 3
```

Move pointers.

Now:

```
4 1 2 3
  L R
```

1 is odd, 2 is even.

Swap:

```
4 2 1 3
```

Result:

```
[4,2,1,3]
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

In-place swapping:

```
O(1)
```

---

## Key Observation

Two pointer partitioning is useful for:

- Even/Odd separation
- 0/1 sorting
- Positive/Negative separation
- Partition problems

---
