# Merge Sort - Count Inversions

## Pattern

Divide and Conquer

---

## Problem

Given an array.

Find number of pairs:

```
(i,j)
```

such that:

```
i < j
```

and:

```
arr[i] > arr[j]
```

---

## Example

Input:

```
[2,4,1,3,5]
```

Output:

```
3
```

Pairs:

```
(2,1)
(4,1)
(4,3)
```

---

## Brute Force

Check every pair.

Two loops:

```
for i
    for j
```

Time:

```
O(n²)
```

Space:

```
O(1)
```

---

## Optimal Idea

Use merge sort.

While merging two sorted halves:

Left:

```
[2,4]
```

Right:

```
[1,3,5]
```

Compare:

```
2 > 1
```

Since left side is sorted:

All remaining left elements are greater.

Count:

```
mid-i+1
```

---

## Algorithm

1. Divide array into halves.

2. Count inversions in:

```
left half
right half
```

3. During merge:

If:

```
left[i] > right[j]
```

then:

```
count += remaining left elements
```

4. Merge normally.

---

## Dry Run

Input:

```
[2,4,1,3,5]
```

Split:

```
[2,4] [1,3,5]
```

Merge:

4 > 1:

Remaining left:

```
1
```

Count:

```
1
```

2 > 1:

Count:

```
1
```

4 > 3:

Count:

```
1
```

Total:

```
3
```

---

## Why Merge Sort?

During merging:

Both halves are already sorted.

This lets us count multiple inversions at once.

---

## Time Complexity

Merge sort levels:

```
log n
```

Each merge:

```
n
```

Total:

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
