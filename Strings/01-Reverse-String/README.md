# Reverse String

## Pattern

Two Pointer

---

## Problem

Reverse a given string.

Example:

Input:

```
hello
```

Output:

```
olleh
```

---

## Brute Force

Create a new string.

Traverse from end:

```
i = length-1 → 0
```

Add characters.

Time:

```
O(n)
```

Space:

```
O(n)
```

---

## Optimal Idea

Use two pointers.

One at:

```
start
```

and one at:

```
end
```

Swap them.

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

5. Stop when:

```
left >= right
```

---

## Dry Run

Input:

```
abcd
```

Start:

```
a b c d
↑     ↑
L     R
```

Swap:

```
d b c a
```

Next:

```
d c b a
```

Answer:

```
dcba
```

---

## Time Complexity

Each character visited once:

```
O(n)
```

---

## Space Complexity

Only swapping:

```
O(1)
```

---
