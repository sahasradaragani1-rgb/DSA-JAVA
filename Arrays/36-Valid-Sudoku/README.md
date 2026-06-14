# Valid Sudoku

## Pattern

Hashing (HashSet)

---

## Problem

Determine if a 9 × 9 Sudoku board is valid.

The following rules must be satisfied:

1. Each row must contain digits 1-9 without repetition.
2. Each column must contain digits 1-9 without repetition.
3. Each 3 × 3 sub-box must contain digits 1-9 without repetition.

Empty cells are represented by `.`.

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
true
```

---

## Intuition

We need to ensure that the same digit does not appear twice in:

- Any row
- Any column
- Any 3×3 box

Use a HashSet to store unique identifiers.

Examples:

```
5 in row 0
5 in col 0
5 in box 0-0
```

If any identifier already exists, the board is invalid.

---

## Algorithm

1. Create an empty HashSet.
2. Traverse every cell.
3. Ignore `.` cells.
4. Generate:
   - Row key
   - Column key
   - Box key
5. If any key already exists:
   - Return false.
6. Otherwise add all keys to the set.
7. If traversal finishes, return true.

---

## Dry Run

Cell:

```
board[0][0] = 5
```

Store:

```
5 in row 0
5 in col 0
5 in box 0-0
```

Next occurrence of:

```
5 in row 0
```

already exists.

Therefore:

```
Invalid Sudoku
```

---

## Time Complexity

The board size is fixed:

```
9 × 9 = 81 cells
```

We visit each cell once.

```
O(81)
```

Which simplifies to:

```
O(1)
```

---

## Space Complexity

Maximum entries stored:

```
81 rows
81 columns
81 boxes
```

Since board size is fixed:

```
O(1)
```

---

## Key Observation

Instead of checking every row, column, and box repeatedly,

we store previously seen values in a HashSet and detect duplicates instantly.

This reduces repeated checking and keeps the solution simple.

---
