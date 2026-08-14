# Find the Position of an Element in a Matrix

## Problem

Given a 2D array of integers and a target element, find the **row and column position** of the target element in the matrix.

If the element is present, print its position. Otherwise, indicate that the element is not present.

The solution should work for both:

* Regular 2D arrays (rectangular matrices)
* Jagged arrays (where each row can have a different number of elements)

---

## Example

### Input

```text
3
2
10 20
3
30 40 50
2
60 70
40
```

### Matrix

```text
10  20
30  40  50
60  70
```

### Target

```text
40
```

### Output

```text
Element found at row 1, column 1
```

> Row and column indices are **0-based**.

---

## Approach

Traverse every element of the matrix using nested loops.

For each element, compare it with the target:

```java
if (matrix[i][j] == target) {
    // Target found
}
```

Here:

* `i` represents the row index.
* `j` represents the column index.
* `target` is the element whose position we need to find.

When the target is found, the current values of `i` and `j` give its position.

---

## Algorithm

1. Read the number of rows.
2. Create a jagged 2D array.
3. For each row:

   * Read the number of elements.
   * Create the row.
   * Read its elements.
4. Read the target element.
5. Initialize `found = false`.
6. Traverse every row using `matrix.length`.
7. Traverse every element using `matrix[i].length`.
8. Compare `matrix[i][j]` with the target.
9. If they are equal:

   * Print the row and column.
   * Set `found = true`.
   * Stop the search.
10. If the complete matrix is searched without finding the target, print that the element was not found.

---

## Dry Run

Given:

```text
10  20
30  40  50
60  70
```

Target:

```text
40
```

Traversal:

```text
matrix[0][0] = 10 → Not found
matrix[0][1] = 20 → Not found
matrix[1][0] = 30 → Not found
matrix[1][1] = 40 → Found
```

Therefore:

```text
Element found at row 1, column 1
```

---

## Position of an Element

For a 2D array:

```java
matrix[i][j]
```

represents the element at:

```text
Row    → i
Column → j
```

Therefore, when:

```java
matrix[i][j] == target
```

the position of the target is:

```text
(row i, column j)
```

---

## Handling Duplicate Elements

If the target occurs multiple times, this implementation returns the **first occurrence**.

For example:

```text
10  20
20  30
```

For target `20`, the output is:

```text
Element found at row 0, column 1
```

because the search proceeds from left to right and top to bottom.

### To Find All Positions

If all occurrences are required, do not stop after finding the first occurrence. Instead, continue traversing the entire matrix and print every matching position.

---

## Traversing a Jagged Array

The following traversal works for both rectangular and jagged arrays:

```java
for (int i = 0; i < matrix.length; i++) {

    for (int j = 0; j < matrix[i].length; j++) {

        // Process matrix[i][j]
    }
}
```

`matrix.length` gives the number of rows.

`matrix[i].length` gives the number of elements in the current row.

---

## Complexity Analysis

Let `N` be the total number of elements in the matrix.

### Best Case

The target is the first element:

```text
O(1)
```

### Average Case

The target is somewhere in the matrix:

```text
O(N)
```

### Worst Case

The target is the last element or does not exist:

```text
O(N)
```

Therefore:

```text
Time Complexity: O(N)
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

Only a boolean variable and loop variables are used:

```text
O(1)
```

---

## Edge Cases

The solution handles:

* Target exists
* Target does not exist
* Target at the first position
* Target at the last position
* Duplicate elements
* Single-element matrix
* Negative numbers
* Zero
* Empty rows
* Rectangular matrices
* Jagged arrays

---

## Key Pattern

```text
2D Array
   ↓
Nested Loops
   ↓
Compare with Target
   ↓
Find Matching Element
   ↓
Return Row + Column
```

This is a fundamental **2D array traversal + linear search** pattern.

---
