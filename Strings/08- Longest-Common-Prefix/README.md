# Longest Common Prefix

## Pattern

String Traversal

---

## Problem

Given an array of strings.

Find the longest prefix common to all strings.

---

## Example

Input:

```
flower
flow
flight
```

Output:

```
fl
```

---

## Brute Force

Take first string.

Generate all prefixes:

```
f
fl
flo
flow
...
```

Check every prefix.

Time:

```
O(n*m)
```

Space:

```
O(n)
```

---

## Optimal Idea

Compare characters vertically.

Example:

```
flower
flow
flight
```

Column:

```
f f f
l l l
o o i
```

Mismatch at:

```
o != i
```

Stop.

Answer:

```
fl
```

---

## Algorithm

1. Take first string as reference.

2. For every character:

Compare with all other strings.

3. If mismatch:

Return current prefix.

---

## Dry Run

Input:

```
dog
door
dot
```

Compare:

```
d d d
o o o
g o t
```

Mismatch.

Output:

```
do
```

---

## Time Complexity

Let:

```
n = number of strings
m = length of smallest string
```

Each character checked:

```
O(n*m)
```

---

## Space Complexity

Only prefix variable:

```
O(1)
```

---
