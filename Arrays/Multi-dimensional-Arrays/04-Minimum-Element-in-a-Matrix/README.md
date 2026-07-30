# Find Minimum Element in a Matrix

## Problem

Given a 2D array of integers, find the minimum element present in the array.

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
1
60
```

### Matrix

```text
10  20
30  40  50
60
```

### Output

```text
Minimum element: 10
```

---

## Approach

Traverse every element of the 2D array using nested loops.

Maintain a variable `min` that stores the smallest element found so far.

Initialize `min` with the first element of the matrix:

```java
int min = matrix[0][0];
```

For every element, compare it with `min`.

If the current element is smaller than `min`, update `min`:

```java
if(matrix[i][j] < min) {
    min = matrix[i][j];
}
```

After traversing the complete matrix, `min` contains the smallest element.

---

## Algorithm

1. Read the number of rows.
2. Create a 2D array.
3. For each row:

   * Read the number of elements.
   * Create the row.
   * Read the elements.
4. Initialize `min` with the first element of the matrix.
5. Traverse every row using `matrix.length`.
6. Traverse every element using `matrix[i].length`.
7. Compare each element with `min`.
8. If the current element is smaller, update `min`.
9. Print the minimum element.

---

## Dry Run

Given the jagged array:

```text
10  20
30  40  50
60
```

Initialize:

```text
min = 10
```

Traverse the elements:

```text
20 < 10  → No change
30 < 10  → No change
40 < 10  → No change
50 < 10  → No change
60 < 10  → No change
```

Final result:

```text
Minimum element = 10
```

---

## Another Example

Consider a matrix containing negative values:

```text
-10  -20
-5   -30  -15
```

Initialize:

```text
min = -10
```

Traversal:

```text
-20 < -10  → min = -20
-5  < -20  → No change
-30 < -20  → min = -30
-15 < -30  → No change
```

Final result:

```text
Minimum element = -30
```

---

## Key Concept

### Finding the Minimum Element

The general pattern for finding the minimum element is:

```java
int min = matrix[0][0];

for(int i = 0; i < matrix.length; i++) {

    for(int j = 0; j < matrix[i].length; j++) {

        if(matrix[i][j] < min) {
            min = matrix[i][j];
        }
    }
}
```

The important point is to initialize `min` with an actual element from the array rather than using `0`.

For example, if the matrix contains only positive values, initializing `min` to `0` would give the wrong answer because `0` is smaller than every element.

Correct initialization:

```java
int min = matrix[0][0];
```

This works correctly for both positive and negative values.

---

## Traversing a Jagged Array

The following nested loop works for both regular and jagged 2D arrays:

```java
for(int i = 0; i < matrix.length; i++) {

    for(int j = 0; j < matrix[i].length; j++) {

        // Process matrix[i][j]
    }
}
```

`matrix.length` gives the number of rows.

`matrix[i].length` gives the number of elements in the current row.

This makes the solution flexible for rows of different sizes.

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

Only the `min` variable is used during traversal:

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
Comparison
+
Track Minimum
```

---
