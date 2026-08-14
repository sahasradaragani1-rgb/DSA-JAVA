# Search for an Element in a Matrix

## Problem

Given a 2D array of integers and a target element, search for the target in the matrix.

If the target element is present, report its position. Otherwise, indicate that the element is not present.

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

Since the matrix is not assumed to be sorted, perform a **linear search**.

Traverse every element using nested loops.

For each element, compare it with the target:

```java
if (matrix[i][j] == target) {
    // Element found
}
```

Here:

* `i` represents the row index.
* `j` represents the column index.
* `target` is the element we are searching for.

If the target is found, its position can be immediately reported.

---

## Algorithm

1. Read the number of rows.
2. Create a jagged 2D array.
3. For each row:

   * Read the number of elements.
   * Create the row.
   * Read the elements.
4. Read the target element.
5. Traverse every row using `matrix.length`.
6. Traverse every element using `matrix[i].length`.
7. Compare each element with the target.
8. If `matrix[i][j] == target`:

   * Report its row and column.
   * Stop searching.
9. If the entire matrix is traversed without finding the target, report that it is not present.

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
10 == 40 → No
20 == 40 → No
30 == 40 → No
40 == 40 → Yes
```

Therefore:

```text
Element found at row 1, column 1
```

---

## Searching for an Element

The core search condition is:

```java
if (matrix[i][j] == target) {
    System.out.println(
        "Element found at row " + i + ", column " + j
    );
}
```

For an unsorted matrix, every element may need to be checked.

---

## Handling Duplicate Elements

If the matrix contains duplicate occurrences of the target, there are two possible approaches:

### Find First Occurrence

Stop immediately after finding the first occurrence.

```java
if (matrix[i][j] == target) {
    found = true;
    break;
}
```

This is the approach used in this solution.

### Find All Occurrences

Continue traversing the entire matrix and print every matching position.

That version would require checking all elements even after the target is found.

---

## Traversing a Jagged Array

The following nested loop works for both regular and jagged arrays:

```java
for (int i = 0; i < matrix.length; i++) {

    for (int j = 0; j < matrix[i].length; j++) {

        // Search matrix[i][j]
    }
}
```

### Why `matrix[i].length`?

A jagged array can have different numbers of elements in each row.

For example:

```text
Row 0 → 2 elements
Row 1 → 3 elements
Row 2 → 2 elements
```

Therefore, we use:

```java
matrix[i].length
```

to get the length of the current row.

---

## Complexity Analysis

Let `N` be the total number of elements in the matrix.

### Time Complexity

#### Best Case

The target is the first element:

```text
O(1)
```

#### Average Case

The target is somewhere in the middle:

```text
O(N)
```

#### Worst Case

The target is the last element or does not exist:

```text
O(N)
```

Therefore, the overall worst-case time complexity is:

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

Only a few variables are used:

```text
O(1)
```

The matrix itself requires `O(N)` input storage.

---

## Edge Cases

The solution correctly handles:

* Target exists in the matrix
* Target does not exist
* Target is the first element
* Target is the last element
* Single-element matrix
* Duplicate target values
* Negative numbers
* Zero
* Empty rows in a jagged array
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
Linear Search
   ↓
Return Position
```

This is the basic **linear search in a 2D array** pattern.

It is useful when:

* The matrix is unsorted.
* There is no additional structure that allows faster searching.
* You need the position of an element.

---

## Important Note

If the matrix has a special ordering, a more efficient algorithm may be possible.

For example, if the matrix is sorted in a specific manner, techniques such as **binary search** or the **staircase search** can reduce the search complexity.

For a general unsorted matrix, however, linear search is the appropriate solution.

---
