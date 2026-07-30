# Find Maximum Element in a Matrix

## Problem

Given a 2D array of integers, find the maximum element present in the array.

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
Maximum element: 60
```

---

## Approach

Traverse every element of the 2D array using nested loops.

Maintain a variable `max` that stores the largest element found so far.

Initialize `max` with the first element of the matrix:

```java
int max = matrix[0][0];
```

For every element, compare it with `max`.

If the current element is greater than `max`, update `max`:

```java
if(matrix[i][j] > max) {
    max = matrix[i][j];
}
```

After traversing the complete matrix, `max` contains the largest element.

---

## Algorithm

1. Read the number of rows.
2. Create a 2D array.
3. For each row:

   * Read the number of elements.
   * Create the row.
   * Read the elements.
4. Initialize `max` with the first element of the matrix.
5. Traverse every row using `matrix.length`.
6. Traverse every element using `matrix[i].length`.
7. Compare each element with `max`.
8. If the current element is greater, update `max`.
9. Print the maximum element.

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
max = 10
```

Traverse the elements:

```text
20 > 10  → max = 20
30 > 20  → max = 30
40 > 30  → max = 40
50 > 40  → max = 50
60 > 50  → max = 60
```

Final result:

```text
Maximum element = 60
```

---

## Key Concept

### Finding Maximum Element

The general pattern for finding the maximum element is:

```java
int max = matrix[0][0];

for(int i = 0; i < matrix.length; i++) {

    for(int j = 0; j < matrix[i].length; j++) {

        if(matrix[i][j] > max) {
            max = matrix[i][j];
        }
    }
}
```

The important point is to initialize `max` with an actual element from the array rather than using `0`.

For example, if the matrix contains only negative values:

```text
-10  -20
-5   -30
```

Initializing:

```java
int max = 0;
```

would give the wrong answer because `0` is not present in the matrix.

Correct initialization:

```java
int max = matrix[0][0];
```

gives the correct result:

```text
-5
```

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

Only the `max` variable is used during traversal:

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
Track Maximum
```

---
