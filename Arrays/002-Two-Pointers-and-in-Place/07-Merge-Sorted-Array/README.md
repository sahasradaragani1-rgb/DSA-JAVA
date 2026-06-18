# Merge Sorted Array

## Pattern

Two Pointer

---

## Problem

Given two sorted arrays:

```
nums1
nums2
```

Merge nums2 into nums1 so that nums1 becomes sorted.

nums1 has enough space to hold all elements.

---

## Example

Input:

```
nums1 = [1,2,3,0,0,0]
m = 3

nums2 = [2,5,6]
n = 3
```

Output:

```
[1,2,2,3,5,6]
```

---

## Intuition

If we merge from the front, we overwrite existing values in nums1.

So start from the end.

Compare the largest elements and place them at the back.

---

## Algorithm

Use three pointers:

```
i = m-1
j = n-1
k = m+n-1
```

Compare:

```
nums1[i]
nums2[j]
```

Place the larger value at:

```
nums1[k]
```

Move pointers backward.

---

## Dry Run

Input:

```
nums1 = [1,3,5,0,0]
nums2 = [2,4]
```

Pointers:

```
i = 2
j = 1
k = 4
```

Compare:

```
5 > 4
```

Place:

```
[1,3,5,0,5]
```

Next:

```
4 > 3
```

Place:

```
[1,3,4,0,5]
```

Next:

```
3 > 2
```

Place:

```
[1,3,4,3,5]
```

Final:

```
[1,2,3,4,5]
```

---

## Time Complexity

Each element is processed once.

```
O(m+n)
```

---

## Space Complexity

No extra array used.

```
O(1)
```

---

## Key Observation

Always merge from the end when one array has extra empty space.

---
