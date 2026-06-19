# Pascal Triangle III

## Pattern

Combinatorics / nCr Formula

---

## Problem

Given row number `r` and column number `c`.

Find the element at that position in Pascal's Triangle.

Indexing is usually:

```
1-based
```

---

## Example

Input:

```
row = 5
column = 3
```

Pascal Triangle:

```
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1
```

Answer:

```
6
```

---

## Observation

Every Pascal Triangle element represents:

```
nCr
```

Formula:

```
C(n,r) = n! / (r! * (n-r)!)
```

For row and column:

```
n = row - 1
r = column - 1
```

---

## Brute Force

Generate the complete triangle.

Example:

For row 5:

```
[1]
[1,1]
[1,2,1]
[1,3,3,1]
[1,4,6,4,1]
```

Then access the value.

Time:

```
O(n²)
```

Space:

```
O(n²)
```

---

## Optimal Approach

Directly calculate nCr.

Instead of factorial:

```
n!
```

calculate step by step:

```
result = result * (n-i) / (i+1)
```

---

## Dry Run

Input:

```
row = 5
column = 3
```

Convert:

```
n = 4
r = 2
```

Calculation:

```
result = 1

i=0

result = 1*4/1
       = 4


i=1

result = 4*3/2
       = 6
```

Answer:

```
6
```

---

## Time Complexity

Loop runs r times:

```
O(r)
```

---

## Space Complexity

Only one variable:

```
O(1)
```

---

## Difference Between Pascal Problems

| Problem | Task |
|---|---|
| Pascal Triangle I | Generate full triangle |
| Pascal Triangle II | Find complete row |
| Pascal Triangle III | Find single element |

---
