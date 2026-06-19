# Pascal's Triangle

## Pattern

Array / Dynamic Programming

---

## Problem

Given an integer `n`, generate the first `n` rows of Pascal's Triangle.

Each number is the sum of the two numbers directly above it.

---

## Example

Input:

```
5
```

Output:

```
[
[1],
[1,1],
[1,2,1],
[1,3,3,1],
[1,4,6,4,1]
]
```

---

## Observation

Rules:

1. Every row starts with:

```
1
```

2. Every row ends with:

```
1
```

3. Middle elements are:

```
above-left + above-right
```

Formula:

```
triangle[i][j] =
triangle[i-1][j-1] + triangle[i-1][j]
```

---

## Algorithm

1. Create an empty triangle.

2. Generate rows from top to bottom.

3. For every position:

If first or last:

```
add 1
```

Else:

```
add previous row values
```

4. Print triangle.

---

## Dry Run

n = 4

Row 0:

```
1
```

Row 1:

```
1 1
```

Row 2:

```
1 2 1
```

Row 3:

```
1 3 3 1
```

---

## Time Complexity

Number of elements:

```
1 + 2 + 3 + ... + n
```

which is:

```
O(n²)
```

---

## Space Complexity

Storing the triangle:

```
O(n²)
```

---

## Variations

### Pascal Triangle I

Return entire triangle.

### Pascal Triangle II

Return only a specific row.

### Pascal Triangle III

Find value at position (row, column).

---
