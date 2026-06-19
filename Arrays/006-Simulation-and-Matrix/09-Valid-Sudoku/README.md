# Valid Sudoku

## Pattern

HashSet / Matrix Traversal

---

## Problem

Determine if a `9 x 9` Sudoku board is valid.

Rules:

1. Each row must contain digits 1-9 without repetition.

2. Each column must contain digits 1-9 without repetition.

3. Each 3x3 sub-box must contain digits 1-9 without repetition.

`.` represents an empty cell.

---

## Example

Input:

```
5 3 . . 7 . . . .
6 . . 1 9 5 . . .
. 9 8 . . . . 6 .
8 . . . 6 . . . 3
4 . . 8 . 3 . . 1
7 . . . 2 . . . 6
. 6 . . . . 2 8 .
. . . 4 1 9 . . 5
. . . . 8 . . 7 9
```

Output:

```
Valid Sudoku
```

---

## Brute Force

For every cell:

Check:

- row
- column
- box

Repeatedly.

Time:

```
O(9³)
```

---

## Optimal Idea

A number is invalid if it appears twice.

So maintain a set while scanning:

```
row set
column set
box set
```

---

## Algorithm

### Row Check

For each row:

```
create HashSet
```

Add every number.

If already present:

```
invalid
```

---

### Column Check

Same process.

---

### Box Check

There are 9 boxes.

Starting positions:

```
(0,0)
(0,3)
(0,6)

(3,0)
(3,3)
(3,6)

(6,0)
(6,3)
(6,6)
```

Check each 3x3 block.

---

## Dry Run

Row:

```
5 3 5
```

Set:

```
{5,3}
```

Second 5 appears:

```
duplicate
```

Invalid.

---

## Time Complexity

Only 81 cells:

```
O(9*9)
```

General:

```
O(n²)
```

---

## Space Complexity

Sets store at most 9 values:

```
O(1)
```

---
