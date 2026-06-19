# Reverse Pairs

## Pattern

Divide and Conquer / Merge Sort

---

## Problem

Find pairs:

```
(i,j)
```

where:

```
i < j
```

and:

```
nums[i] > 2 * nums[j]
```

---

## Example

Input:

```
[1,3,2,3,1]
```

Output:

```
2
```

Pairs:

```
(3,1)
(3,1)
```

---

## Difference From Count Inversions

Inversions:

```
nums[i] > nums[j]
```

Reverse Pairs:

```
nums[i] > 2 * nums[j]
```

The idea is the same.

---

## Brute Force

Check every pair.

```
for i
    for j
```

Time:

```
O(n²)
```

---

## Optimal Idea

Use merge sort.

After dividing:

Left half:

```
sorted
```

Right half:

```
sorted
```

Now count valid pairs before merging.

---

## Counting Logic

For each element in left:

Find how many elements in right satisfy:

```
nums[i] > 2*nums[j]
```

Since right half is sorted:

Use pointer `j`.

When condition becomes false:

stop.

---

## Example

Array:

```
[1,3,2,3,1]
```

Split:

```
[1,3,2] [3,1]
```

Compare:

```
3 > 2*1
```

valid.

Count.

---

## Why Long?

Condition:

```
2 * nums[j]
```

can overflow integer.

Use:

```
2L * nums[j]
```

---

## Time Complexity

Merge sort:

```
O(n log n)
```

Counting:

```
O(n)
```

Overall:

```
O(n log n)
```

---

## Space Complexity

Temporary array:

```
O(n)
```

---
