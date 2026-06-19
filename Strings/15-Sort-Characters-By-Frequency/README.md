# Sort Characters By Frequency

## Pattern

HashMap + Heap

---

## Problem

Given a string.

Sort characters in decreasing order of frequency.

---

## Example

Input:

```
tree
```

Output:

```
eert
```

Because:

```
e → 2
t → 1
r → 1
```

---

## Brute Force

Count frequency.

Sort all characters manually.

Time:

```
O(n log n)
```

Space:

```
O(n)
```

---

## Optimal Idea

Use:

```
HashMap
```

to store frequencies.

Then:

```
Max Heap
```

to always pick the highest frequency character.

---

## Algorithm

1. Count characters:

```
a → 3
b → 1
```

2. Add characters to max heap.

3. Remove highest frequency character.

4. Append it frequency times.

---

## Dry Run

Input:

```
cccaaa
```

Frequency:

```
c = 3
a = 3
```

Heap:

```
c,a
```

Output:

```
cccaaa
```

---

## Time Complexity

Building map:

```
O(n)
```

Heap operations:

```
O(k log k)
```

Overall:

```
O(n log k)
```

where k = unique characters.

---

## Space Complexity

HashMap + heap:

```
O(n)
```

---
