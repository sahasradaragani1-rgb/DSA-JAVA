# Count Number of Substrings

## Pattern

Mathematics

---

## Problem

Given a string of length `n`.

Count the total number of possible substrings.

---

## Example

Input:

```
abc
```

Substrings:

```
a
b
c
ab
bc
abc
```

Output:

```
6
```

---

## Observation

For every starting index:

```
0 → n substrings
1 → n-1 substrings
2 → n-2 substrings
...
n-1 → 1 substring
```

Total:

```
n + (n-1) + (n-2) + ... + 1
```

---

## Formula

Sum of first n natural numbers:

```text
n × (n + 1)
-------------
      2
```

Therefore:

```text
Total Substrings =
n × (n + 1) / 2
```

---

## Dry Run

Input:

```
abcd
```

Length:

```
n = 4
```

Count:

```text
4 × 5 / 2 = 10
```

Substrings:

```
a
b
c
d
ab
bc
cd
abc
bcd
abcd
```

Total:

```
10
```

---

## Time Complexity

Formula evaluation:

```
O(1)
```

---

## Space Complexity

```
O(1)
```

---
