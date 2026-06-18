# Merge Two Sorted Arrays Without Extra Space

## Pattern

Gap Method

---

## Problem

Given two sorted arrays:

```
arr1[]
arr2[]
```

Merge them without using extra space such that:

```
All smaller elements remain in arr1
All larger elements remain in arr2
```

Both arrays should remain sorted.

---

## Example

Input:

```
arr1 = [1,4,8,10]
arr2 = [2,3,9]
```

Output:

```
arr1 = [1,2,3,4]
arr2 = [8,9,10]
```

---

## Brute Force

Create a third array.

```
Merge both arrays
Copy back
```

Time:

```
O(n+m)
```

Space:

```
O(n+m)
```

Not allowed.

---

## Optimal Idea

Treat both arrays as one virtual array:

```
[1,4,8,10 | 2,3,9]
```

Apply Shell Sort's Gap Method.

Compare elements that are:

```
gap distance apart
```

and swap if needed.

Gradually reduce gap.

---

## Gap Formula

```
gap = ceil(length / 2)
```

Next gap:

```
gap = ceil(gap / 2)
```

Until:

```
gap = 1
```

---

## Dry Run

Input:

```
arr1 = [1,4,8,10]
arr2 = [2,3,9]
```

Virtual Array:

```
[1,4,8,10,2,3,9]
```

Gap:

```
4
```

Compare:

```
1 & 2
4 & 3
8 & 9
...
```

Swap where necessary.

Continue reducing gap.

Final:

```
[1,2,3,4,8,9,10]
```

Split back:

```
arr1 = [1,2,3,4]
arr2 = [8,9,10]
```

---

## Time Complexity

Gap decreases logarithmically.

```
O((n+m) log(n+m))
```

---

## Space Complexity

No extra array used.

```
O(1)
```

---

## Why Gap Method?

Interviewers often reject:

```
Extra array solution
```

Gap method is the expected optimized solution.

---
