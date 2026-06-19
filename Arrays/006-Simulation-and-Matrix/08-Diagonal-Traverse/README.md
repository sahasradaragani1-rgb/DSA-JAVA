# Diagonal Traverse

## Pattern

Matrix Traversal

---

## Problem

Given an `m x n` matrix.

Return elements in diagonal order.

The direction alternates:

```
up-right
down-left
up-right
down-left
```

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
1 2 4 7 5 3 6 8 9
```

---

## Intuition

There are two diagonal movements:

### Up-right

```
↗
```

Row decreases:

```
row--
```

Column increases:

```
col++
```

---

### Down-left

```
↙
```

Row increases:

```
row++
```

Column decreases:

```
col--
```

---

## Algorithm

Maintain:

```
row
col
direction
```

For every element:

1. Add current value.

2. If moving up-right:

   - Hit right boundary:
     move down.
   - Hit top boundary:
     move right.

3. If moving down-left:

   - Hit bottom boundary:
     move right.
   - Hit left boundary:
     move down.

4. Reverse direction.

---

## Dry Run

Matrix:

```
1 2 3
4 5 6
7 8 9
```

Traversal:

```
1

↗
2 4

↙
7 5 3

↘
6 8

9
```

Answer:

```
1 2 4 7 5 3 6 8 9
```

---

## Time Complexity

Every element visited once:

```
O(m*n)
```

---

## Space Complexity

Only variables:

```
O(1)
```

(excluding output)

---
