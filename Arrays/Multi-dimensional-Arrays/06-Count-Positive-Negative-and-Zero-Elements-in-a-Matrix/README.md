# Count Positive, Negative and Zero Elements in a Matrix

## Problem

Given a 2D array of integers, count the number of:

* Positive elements
* Negative elements
* Zero elements

The solution should work for both:

* Regular 2D arrays (rectangular matrices)
* Jagged arrays (where each row can have a different number of elements)

---

## Example

### Input

```text
3
2
10 -21
3
0 41 -52
1
63
```

### Matrix

```text
10  -21
0    41  -52
63
```

### Output

```text
Positive elements: 3
Negative elements: 2
Zero elements: 1
```

---

## Approach

Traverse every element of the 2D array using nested loops.

For each element:

* If the element is greater than `0`, it is positive.
* If the element is less than `0`, it is negative.
* Otherwise, it is zero.

The conditions are:

```java
if (matrix[i][j] > 0) {
    positiveCount++;
}
else if (matrix[i][j] < 0) {
    negativeCount++;
}
else {
    zeroCount++;
}
```

---

## Algorithm

1. Read the number of rows.
2. Create a jagged 2D array.
3. For each row:

   * Read the number of elements.
   * Create the row.
   * Read the elements.
4. Initialize `positiveCount = 0`.
5. Initialize `negativeCount = 0`.
6. Initialize `zeroCount = 0`.
7. Traverse every row using `matrix.length`.
8. Traverse every element using `matrix[i].length`.
9. If the current element is greater than `0`, increment `positiveCount`.
10. Else if the current element is less than `0`, increment `negativeCount`.
11. Otherwise, increment `zeroCount`.
12. Print all three counts.

---

## Dry Run

Given the jagged array:

```text
10  -21
0    41  -52
63
```

Check each element:

```text
10  > 0  → Positive
-21 < 0  → Negative
0   = 0  → Zero
41  > 0  → Positive
-52 < 0  → Negative
63  > 0  → Positive
```

Therefore:

```text
Positive elements = 3
Negative elements = 2
Zero elements     = 1
```

---

## Handling Negative Numbers

Negative numbers are directly identified using:

```java
matrix[i][j] < 0
```

For example:

```text
-10 < 0 → Negative
-5  < 0 → Negative
-1  < 0 → Negative
```

No special handling is required for negative values.

---

## Handling Zero

Zero is neither positive nor negative.

Therefore, it is handled separately:

```java
else {
    zeroCount++;
}
```

For example:

```text
0 → Zero
```

---

## Traversing a Jagged Array

The following nested loop works for both rectangular and jagged 2D arrays:

```java
for (int i = 0; i < matrix.length; i++) {

    for (int j = 0; j < matrix[i].length; j++) {

        // Process matrix[i][j]
    }
}
```

### Why `matrix[i].length`?

In a jagged array, every row can have a different number of elements.

For example:

```text
Row 0 → 2 elements
Row 1 → 3 elements
Row 2 → 1 element
```

Therefore, we use:

```java
matrix[i].length
```

to determine the length of the current row.

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

Only three counter variables are used:

```text
O(1)
```

The input matrix itself requires:

```text
O(N)
```

space, but this is considered input storage rather than auxiliary space.

---

## Edge Cases

The solution correctly handles:

* All positive elements
* All negative elements
* All zero elements
* A mixture of positive, negative and zero values
* Single-element matrices
* Negative integers
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
Comparison
   ↓
Classification
   ↓
Counting
```

This is a fundamental **2D array traversal + classification + counting** pattern.

The same pattern can be adapted to problems involving:

* Even and odd elements
* Positive and negative elements
* Maximum and minimum elements
* Frequency counting
* Searching
* Sum and average

---
