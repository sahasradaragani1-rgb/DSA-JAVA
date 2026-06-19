# Roman to Integer

## Pattern

String Traversal

---

## Problem

Convert a Roman numeral into an integer.

Roman symbols:

| Symbol | Value |
|----------|---------|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

---

## Example

Input:

```
III
```

Output:

```
3
```

---

Input:

```
LVIII
```

Output:

```
58
```

Because:

```
L = 50
V = 5
III = 3
```

---

Input:

```
MCMXCIV
```

Output:

```
1994
```

---

## Key Observation

Normally Roman values are added:

```
VIII

5 + 1 + 1 + 1 = 8
```

But some combinations mean subtraction:

```
IV = 4
IX = 9
XL = 40
XC = 90
CD = 400
CM = 900
```

---

## Optimal Idea

Traverse from right to left.

If current symbol is smaller than the previous larger symbol:

```
subtract
```

Otherwise:

```
add
```

---

## Algorithm

For each character:

Get value.

If:

```
current < previous
```

subtract.

Else:

```
add.
```

Update previous.

---

## Dry Run

Input:

```
MCMIV
```

Traverse from right:

```
V = 5
```

ans = 5

```
I = 1 < 5
```

ans = 4

```
M = 1000
```

ans = 1004

```
C = 100 < 1000
```

ans = 904

```
M = 1000
```

ans = 1904

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Only variables:

```
O(1)
```

---
