# Count Even and Odd Elements in a Matrix

## Problem

Given a 2D array of integers, count the number of even and odd elements present in the array.

The solution should work for both:

* Regular 2D arrays (rectangular matrices)
* Jagged arrays (where each row can have a different number of elements)

---

## Example

### Input

```text id="x3y2by"
3
2
10 21
3
30 41 52
1
63
```

### Matrix

```text id="q1b6jz"
10  21
30  41  52
63
```

### Output

```text id="a8x0l5"
Even elements: 4
Odd elements: 3
```

---

## Approach

Traverse every element of the 2D array using nested loops.

For each element, check whether it is divisible by `2`.

If:

```java id="j8k1e7"
matrix[i][j] % 2 == 0
```

the element is even, so increment `evenCount`.

Otherwise, the element is odd, so increment `oddCount`.

```java id="x8f4s0p"
if(matrix[i][j] % 2 == 0) {
    evenCount++;
}
else {
    oddCount++;
}
```

---

## Algorithm

1. Read the number of rows.
2. Create a 2D array.
3. For each row:

   * Read the number of elements.
   * Create the row.
   * Read the elements.
4. Initialize `evenCount = 0`.
5. Initialize `oddCount = 0`.
6. Traverse every row using `matrix.length`.
7. Traverse every element using `matrix[i].length`.
8. Check whether each element is divisible by `2`.
9. If the remainder is `0`, increment `evenCount`.
10. Otherwise, increment `oddCount`.
11. Print both counts.

---

## Dry Run

Given the jagged array:

```text id="z1o7kj"
10  21
30  41  52
63
```

Check each element:

```text id="k4z1f5"
10 % 2 = 0  → Even
21 % 2 = 1  → Odd
30 % 2 = 0  → Even
41 % 2 = 1  → Odd
52 % 2 = 0  → Even
63 % 2 = 1  → Odd
```

Therefore:

```text id="z7j5bq"
Even elements = 3
Odd elements  = 3
```

> Note: The example output above should therefore be `Even elements: 3` and `Odd elements: 3` for this exact input.

---

## Handling Negative Numbers

The modulo operator also works correctly with negative integers.

For example:

```text id="9g3z7q"
-10 % 2 = 0  → Even
-7 % 2 = -1  → Odd
-4 % 2 = 0  → Even
```

So the same condition works:

```java id="9z3j2k"
matrix[i][j] % 2 == 0
```

No special handling is required for negative numbers.

---

## Traversing a Jagged Array

The following nested loop works for both regular and jagged 2D arrays:

```java id="1h2e9x"
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

```text id="0ctz8r"
O(N)
```

For a rectangular matrix with `R` rows and `C` columns:

```text id="cq4c7c"
O(R × C)
```

For a jagged array:

```text id="tq6a9d"
O(sum of lengths of all rows)
```

### Auxiliary Space Complexity

Only two counter variables are used:

```text id="cqkz2n"
O(1)
```

The input matrix itself requires:

```text id="8j7xsn"
O(N)
```

space, but this is considered input storage rather than auxiliary space.

---

## Key Pattern

```text id="z8v1xm"
2D Array
+
Nested Loops
+
Modulo Operator
+
Counting
```

---
