# Rotate Image

## Pattern

Matrix Manipulation

---

## Problem

Given an `n x n` matrix.

Rotate it by:

```
90 degrees clockwise
```

Do it in-place.

---

## Example

Input:

```
1 2 3
4 5 6
7 8 9
```

Output:

```
7 4 1
8 5 2
9 6 3
```

---

## Brute Force

Create another matrix.

For every element:

```
new[j][n-1-i] = old[i][j]
```

Space:

```
O(n²)
```

---

## Optimal Idea

A 90° clockwise rotation can be achieved by:

### Step 1

Transpose matrix:

Rows become columns.

Example:

Before:

```
1 2 3
4 5 6
7 8 9
```

After transpose:

```
1 4 7
2 5 8
3 6 9
```

---

### Step 2

Reverse every row:

```
7 4 1
8 5 2
9 6 3
```

Final rotated matrix.

---

## Algorithm

1. Traverse upper triangle.

Swap:

```
matrix[i][j]
with
matrix[j][i]
```

2. Reverse every row using two pointers.

---

## Dry Run

Matrix:

```
1 2
3 4
```

Transpose:

```
1 3
2 4
```

Reverse rows:

```
3 1
4 2
```

Answer:

```
3 1
4 2
```

---

## Why j starts from i?

Because swapping both sides:

```
matrix[i][j]
matrix[j][i]
```

twice would undo the transpose.

---

## Time Complexity

Every cell visited:

```
O(n²)
```

---

## Space Complexity

No extra matrix:

```
O(1)
```

---

## Rotation Rules

90° clockwise:

```
Transpose + Reverse rows
```

90° anticlockwise:

```
Reverse rows + Transpose
```

180°:

```
Reverse rows + Reverse columns
```

---
