# Reverse String

## Pattern

Two Pointer

---

## Problem

Reverse a string in-place.

---

## Example

Input:

```
hello
```

Output:

```
olleh
```

---

## Intuition

A string can be reversed by swapping:

```
first ↔ last
second ↔ second last
```

Continue until both pointers meet.

---

## Algorithm

1. Convert string into character array.
2. Set:

```
left = 0
right = n-1
```

3. Swap:

```
arr[left]
arr[right]
```

4. Move:

```
left++
right--
```

5. Convert character array back to string.

---

## Dry Run

Input:

```
abcd
```

Initial:

```
a b c d
↑     ↑
L     R
```

Swap:

```
d b c a
```

Move:

```
  ↑ ↑
  L R
```

Swap:

```
d c b a
```

Output:

```
dcba
```

---

## Time Complexity

Each character is visited once.

```
O(n)
```

---

## Space Complexity

Character array used:

```
O(n)
```

If modifying a given char array directly:

```
O(1)
```

---

## Key Observation

Two pointers reduce unnecessary operations.

---
