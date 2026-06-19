# Set Matrix Zeroes

## Pattern

Matrix / In-place Modification

---

## Problem

Given an `m x n` matrix.

If an element is `0`, set its entire:

- row
- column

to `0`.

Do it in-place.

---

## Example

Input:

```
[
 [1,1,1],
 [1,0,1],
 [1,1,1]
]
```

Output:

```
[
 [1,0,1],
 [0,0,0],
 [1,0,1]
]
```

---

## Brute Force

For every zero:

Store its row and column.

Then update matrix.

Using extra arrays:

```
row[]
col[]
```

Time:

```
O(m*n)
```

Space:

```
O(m+n)
```

---

## Optimal Idea

Use the matrix itself as storage.

The first row and first column act as markers.

If:

```
matrix[i][j] == 0
```

mark:

```
matrix[i][0] = 0
matrix[0][j] = 0
```

Meaning:

- make row i zero
- make column j zero

---

## Algorithm

1. Check if first row contains zero.

2. Check if first column contains zero.

3. Traverse remaining matrix.

If zero found:

```
mark its row and column
```

4. Traverse again and set cells to zero.

5. Finally handle first row and first column.

---

## Dry Run

Matrix:

```
1 1 1
1 0 1
1 1 1
```

Find zero at:

```
(1,1)
```

Mark:

```
row 1
column 1
```

Matrix becomes:

```
1 0 1
0 0 1
1 0 1
```

Final:

```
1 0 1
0 0 0
1 0 1
```

---

## Why Handle First Row Separately?

Because we are using:

```
matrix[0][j]
```

as markers.

Changing it early would destroy information.

---

## Time Complexity

Traverse matrix multiple times:

```
O(m*n)
```

---

## Space Complexity

No extra matrix/array:

```
O(1)
```

---
