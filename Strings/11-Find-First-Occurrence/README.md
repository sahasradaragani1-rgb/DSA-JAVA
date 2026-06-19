# Find First Occurrence

## Pattern

String Matching

---

## Problem

Given two strings:

```
haystack
needle
```

Find the first index where `needle` appears in `haystack`.

Return:

```
-1
```

if not found.

---

## Example

Input:

```
haystack = hello
needle = ll
```

Output:

```
2
```

---

## Brute Force Idea

Try every position as starting point.

Example:

```
hello
 ^
```

Check if needle matches from there.

---

## Algorithm

1. Loop through every index.

2. Compare characters:

```
haystack[i+j]
needle[j]
```

3. If all characters match:

Return `i`.

---

## Dry Run

Input:

```
sadbutsad
sad
```

Start:

```
0
```

Compare:

```
s == s
a == a
d == d
```

Match found.

Answer:

```
0
```

---

## Time Complexity

Let:

```
n = haystack length
m = needle length
```

For every position:

```
m comparisons
```

Total:

```
O(n*m)
```

---

## Space Complexity

No extra storage:

```
O(1)
```

---

## Better Approach

For very large strings:

Use:

```
KMP Algorithm
```

Time:

```
O(n+m)
```

---
