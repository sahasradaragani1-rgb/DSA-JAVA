# Rotate Image

## Pattern

Matrix Manipulation (Transpose + Reverse)

---

## Problem

You are given an `n × n` matrix representing an image.

Rotate the image by **90 degrees clockwise**.

You must rotate the image **in-place**, meaning you cannot use another matrix.

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

## Intuition

A direct rotation using another matrix requires:

```
O(n²) Space
```

Instead, rotate in-place using two steps:

1. Transpose the matrix.
2. Reverse each row.

---

## Algorithm

### Step 1: Transpose

Convert rows into columns.

```
1 2 3
4 5 6
7 8 9
```

becomes

```
1 4 7
2 5 8
3 6 9
```

---

### Step 2: Reverse Each Row

```
1 4 7
2 5 8
3 6 9
```

becomes

```
7 4 1
8 5 2
9 6 3
```

---

## Dry Run

Input:

```
1 2 3
4 5 6
7 8 9
```

After Transpose:

```
1 4 7
2 5 8
3 6 9
```

After Reversing Rows:

```
7 4 1
8 5 2
9 6 3
```

Final Answer:

```
7 4 1
8 5 2
9 6 3
```

---

## Time Complexity

### Transpose

Nested loops:

```java
for(i)
    for(j)
```

Visits approximately:

```
n² / 2 cells
```

Time:

```
O(n²)
```

### Reverse Rows

Each row is reversed once.

```
n rows × n elements
```

Time:

```
O(n²)
```

Total:

```
O(n²) + O(n²)
```

Ignoring constants:

```
Time Complexity = O(n²)
```

---

## Space Complexity

Only temporary variables are used:

```java
temp
left
right
```

No additional matrix is created.

```
Space Complexity = O(1)
```

---

## Key Observation

90° Clockwise Rotation can be decomposed into:

```
Transpose
+
Reverse Rows
```

This avoids creating another matrix and achieves the required in-place solution.

---
