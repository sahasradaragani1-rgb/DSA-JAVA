# Sum of All Elements in a Matrix

## Problem

Given a 2D array, find the sum of all its elements.

The solution should work for both:

* Regular 2D arrays (rectangular matrices)
* Jagged arrays (where each row can have a different number of elements)

---

## Example

### Input

```text
4
2
1 2
3
3 4 5
1
6
4
7 8 9 10
```

### Matrix

```text
1  2
3  4  5
6
7  8  9  10
```

### Output

```text
Sum of all elements: 55
```

---

## Approach

Use nested loops to traverse every element of the 2D array.

The outer loop traverses each row:

```java
for(int i = 0; i < matrix.length; i++)
```

The inner loop traverses all elements in the current row:

```java
for(int j = 0; j < matrix[i].length; j++)
```

Using `matrix[i].length` is important because the solution supports jagged arrays, where every row can have a different length.

For every element, add its value to `sum`:

```java
sum += matrix[i][j];
```

---

## Algorithm

1. Read the number of rows.
2. Create a 2D array with the specified number of rows.
3. For each row:

   * Read the number of elements.
   * Create the row with that size.
   * Read the elements.
4. Initialize `sum = 0`.
5. Traverse every row using `matrix.length`.
6. Traverse every element of the current row using `matrix[i].length`.
7. Add each element to `sum`.
8. Print the final sum.

---

## Dry Run

Given the jagged array:

```text
1  2
3  4  5
6
7  8  9  10
```

The calculation is:

```text
sum = 0

sum = 0 + 1  = 1
sum = 1 + 2  = 3
sum = 3 + 3  = 6
sum = 6 + 4  = 10
sum = 10 + 5 = 15
sum = 15 + 6 = 21
sum = 21 + 7 = 28
sum = 28 + 8 = 36
sum = 36 + 9 = 45
sum = 45 + 10 = 55
```

Final result:

```text
55
```

---

## Key Concept

### Traversing a Jagged Array

For a regular matrix, every row has the same number of columns.

For example:

```text
1  2  3
4  5  6
7  8  9
```

For a jagged array, each row can have a different number of elements:

```text
1  2
3  4  5
6
7  8  9  10
```

Therefore, instead of using a fixed column size, use:

```java
matrix[i].length
```

The general traversal pattern is:

```java
for(int i = 0; i < matrix.length; i++) {

    for(int j = 0; j < matrix[i].length; j++) {

        // Process matrix[i][j]
    }
}
```

This pattern works for both rectangular and jagged 2D arrays.

---

## Complexity Analysis

Let `N` be the total number of elements across all rows.

### Time Complexity

Every element is visited exactly once:

```text
O(N)
```

For a rectangular matrix with `R` rows and `C` columns:

```text
O(R × C)
```

For a jagged array:

```text
O(sum of lengths of all rows)
```

### Auxiliary Space Complexity

Only the `sum` variable is used during traversal:

```text
O(1)
```

The input matrix itself requires:

```text
O(N)
```

space, but this is considered input storage rather than auxiliary space.

---

## Key Pattern

```text
2D Array
+
Nested Loops
+
matrix[i].length
```

---
