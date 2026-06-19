# Spiral Matrix

## Pattern

Matrix Traversal

---

## Problem

Given an `m x n` matrix.

Return all elements in spiral order.

Traversal:

```
clockwise spiral
```

---

## Example

Input:

```
1  2  3
4  5  6
7  8  9
```

Output:

```
1 2 3 6 9 8 7 4 5
```

---

## Intuition

Maintain four boundaries:

```
top
bottom
left
right
```

These represent the unvisited part of the matrix.

---

## Algorithm

Repeat until all elements are visited:

### 1. Traverse top row

```
left → right
```

Move:

```
top++
```

---

### 2. Traverse right column

```
top → bottom
```

Move:

```
right--
```

---

### 3. Traverse bottom row

```
right → left
```

Move:

```
bottom--
```

---

### 4. Traverse left column

```
bottom → top
```

Move:

```
left++
```

---

## Dry Run

Matrix:

```
1 2 3
4 5 6
7 8 9
```

Start:

```
top=0
bottom=2
left=0
right=2
```

Top row:

```
1 2 3
```

Right column:

```
6 9
```

Bottom row:

```
8 7
```

Left column:

```
4
```

Middle:

```
5
```

Answer:

```
1 2 3 6 9 8 7 4 5
```

---

## Important Conditions

Before traversing bottom row:

```
top <= bottom
```

Before traversing left column:

```
left <= right
```

These prevent duplicate printing.

---

## Time Complexity

Every element visited once:

```
O(m*n)
```

---

## Space Complexity

Output list:

```
O(m*n)
```

Extra variables:

```
O(1)
```

---
