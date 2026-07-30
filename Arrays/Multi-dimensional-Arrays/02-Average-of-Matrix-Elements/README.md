# Find Average of Matrix Elements

## Problem

Given a 2D array of integers, find the average of all the elements present in the array.

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
Average of all elements: 35.0
```

---

## Approach

Use nested loops to traverse every element of the 2D array.

Maintain two variables:

* `sum` → stores the sum of all elements
* `count` → stores the total number of elements

For every element:

```java
sum += matrix[i][j];
count++;
```

After traversing the complete matrix, calculate the average:

```java
double average = (double) sum / count;
```

Type casting `sum` to `double` is important because it ensures that the division produces a decimal result instead of integer division.

---

## Algorithm

1. Read the number of rows.
2. Create a 2D array.
3. For each row:

   * Read the number of elements.
   * Create the row.
   * Read the elements.
4. Initialize `sum = 0` and `count = 0`.
5. Traverse every row using `matrix.length`.
6. Traverse every element using `matrix[i].length`.
7. Add each element to `sum`.
8. Increment `count` for every element.
9. Calculate the average using `sum / count`.
10. Print the result.

---

## Dry Run

Given the jagged array:

```text
10  20
30  40  50
60
```

### Calculate Sum

```text
sum = 10 + 20 + 30 + 40 + 50 + 60
sum = 210
```

### Count Elements

```text
count = 6
```

### Calculate Average

```text
average = 210 / 6
average = 35.0
```

Final result:

```text
35.0
```

---

## Key Concept

### Average Formula

The average is calculated by dividing the sum of all elements by the total number of elements.

```text
Average = Sum of all elements / Number of elements
```

In Java:

```java
double average = (double) sum / count;
```

The explicit `(double)` conversion prevents integer division.

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

This is important for jagged arrays because different rows may have different lengths.

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

Only `sum`, `count`, and `average` variables are used during traversal:

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
Sum
+
Count
+
Average
```

---
