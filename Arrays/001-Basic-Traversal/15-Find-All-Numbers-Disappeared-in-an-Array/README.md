# Find All Numbers Disappeared in an Array

## Pattern

Array Index Marking

---

## Problem

Given an array containing numbers from:

```
1 to n
```

some numbers appear twice and some appear once.

Find all numbers from:

```
1 to n
```

that are missing.

---

## Example

Input:

```
[4,3,2,7,8,2,3,1]
```

Output:

```
5 6
```

Explanation:

Numbers present:

```
1,2,3,4,7,8
```

Missing:

```
5,6
```

---

## Intuition

Numbers are in the range:

```
1 to n
```

So each number can map to an index:

```
number x → index x-1
```

Use the array itself to store information.

---

## Algorithm

1. Traverse the array.
2. For every number:

```
index = abs(number) - 1
```

3. Mark that index negative.
4. Traverse again.
5. Positive indices represent missing numbers.

---

## Dry Run

Input:

```
[4,3,2,7,8,2,3,1]
```

Mark:

```
4 → index 3
3 → index 2
2 → index 1
7 → index 6
8 → index 7
2 → index 1
3 → index 2
1 → index 0
```

Array becomes:

```
[-4,-3,-2,-7,8,2,-3,-1]
```

Positive values:

```
index 4
index 5
```

Missing numbers:

```
5,6
```

---

## Time Complexity

First traversal:

```
O(n)
```

Second traversal:

```
O(n)
```

Overall:

```
O(n)
```

---

## Space Complexity

No extra array used.

```
O(1)
```

(output list is not counted)

---

## Key Observation

Since numbers are between:

```
1 and n
```

they can directly represent array indices.

---
