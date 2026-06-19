# Pascal's Triangle II

## Pattern

Array / Dynamic Programming

---

## Problem

Given a row index `rowIndex`, return that row of Pascal's Triangle.

Index starts from:

```
0
```

---

## Example 1

Input:

```
rowIndex = 3
```

Output:

```
[1,3,3,1]
```

Explanation:

Pascal Triangle:

```
0 → [1]
1 → [1,1]
2 → [1,2,1]
3 → [1,3,3,1]
```

---

## Example 2

Input:

```
rowIndex = 4
```

Output:

```
[1,4,6,4,1]
```

---

## Brute Force Approach

Generate the entire Pascal Triangle.

For `n` rows:

```
1
1 1
1 2 1
1 3 3 1
...
```

Then return the required row.

Time:

```
O(n²)
```

Space:

```
O(n²)
```

---

## Optimal Idea

We only need one row.

Use a single array/list.

Each new value is calculated from:

```
current[j] = current[j] + current[j-1]
```

Update from right to left so old values are not overwritten.

---

## Algorithm

1. Start:

```
row = [1]
```

2. For every level:

Add a new ending:

```
1
```

3. Update middle elements from right to left:

```
row[j] = row[j] + row[j-1]
```

4. Print row.

---

## Dry Run

rowIndex = 3


Start:

```
[1]
```

After row 1:

```
[1,1]
```

After row 2:

```
[1,2,1]
```

After row 3:

```
[1,3,3,1]
```

Answer:

```
[1,3,3,1]
```

---

## Why Traverse Backwards?

Suppose:

```
[1,2,1]
```

To make next row:

```
[1,3,3,1]
```

If we go left to right:

```
row[1] = row[1]+row[0]
```

changes values needed later.

So go:

```
right → left
```

to preserve previous values.

---

## Time Complexity

For row `n`:

```
O(n²)
```

---

## Space Complexity

Only one row stored:

```
O(n)
```

---

## Difference

Pascal Triangle I:

```
Generate all rows
Space O(n²)
```

Pascal Triangle II:

```
Generate one row
Space O(n)
```

---
