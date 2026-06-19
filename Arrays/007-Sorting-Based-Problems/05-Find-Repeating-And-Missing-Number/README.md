# Find Repeating and Missing Number

## Pattern

Math / Array

---

## Problem

Given an array of size `n`.

It contains numbers from:

```
1 to n
```

But:

- one number repeats
- one number is missing

Find both.

---

## Example

Input:

```
[3,1,2,5,3]
```

Output:

```
Repeating = 3
Missing = 4
```

---

## Brute Force

Use frequency array.

Example:

```
freq[1]++
freq[2]++
...
```

If:

```
freq[i] == 2
```

repeating.

If:

```
freq[i] == 0
```

missing.

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

Use equations.

Let:

```
x = repeating
y = missing
```

Expected sum:

```
1+2+...+n
```

Actual sum:

```
array sum
```

Difference:

```
x-y
```

---

Square sums:

Expected:

```
1²+2²+...+n²
```

Actual:

```
array square sum
```

Difference:

```
x²-y²
```

Factor:

```
(x-y)(x+y)
```

Find:

```
x+y
```

Then solve:

```
x-y
x+y
```

---

## Dry Run

Input:

```
[3,1,2,5,3]
```

n:

```
5
```

Expected sum:

```
15
```

Actual sum:

```
14
```

Difference:

```
x-y = -1
```

Square difference gives:

```
x+y = 7
```

Solve:

```
x = 3
y = 4
```

Answer:

```
Repeating = 3
Missing = 4
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

No extra array:

```
O(1)
```

---

## Alternative Approach

Using XOR:

```
O(n) time
O(1) space
```

Also avoids overflow issues.

---
