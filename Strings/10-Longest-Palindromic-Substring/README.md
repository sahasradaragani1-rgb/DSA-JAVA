# Longest Palindromic Substring

## Pattern

String + Two Pointer + Expansion

---

## Problem

Find the longest substring which is a palindrome.

A palindrome reads the same:

```
forward == backward
```

---

## Example

Input:

```
babad
```

Output:

```
bab
```

(or)

```
aba
```

---

## Brute Force

Generate all substrings.

For each substring:

Check palindrome.

Number of substrings:

```
n²
```

Checking each:

```
n
```

Total:

```
O(n³)
```

---

## Optimal Idea

Every palindrome has a center.

Examples:

Odd length:

```
aba
 ^
center
```

Even length:

```
abba
 ^^
center
```

Expand around every possible center.

---

## Algorithm

For every index:

1. Consider it as odd center:

```
i,i
```

2. Consider gap as even center:

```
i,i+1
```

3. Expand while:

```
left == right
```

4. Store maximum length.

---

## Dry Run

Input:

```
cbbd
```

Centers:

```
c
b
b
d
```

Even center:

```
bb
```

Expand:

```
bb
```

Longest:

```
bb
```

---

## Time Complexity

There are:

```
2n-1 centers
```

Each expansion can take:

```
O(n)
```

Overall:

```
O(n²)
```

---

## Space Complexity

Only variables used:

```
O(1)
```

---
