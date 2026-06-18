# Intersection of Two Arrays II

## Pattern

HashMap Frequency Counting

---

## Problem

Given two integer arrays, return their intersection.

Each element in the result should appear as many times as it appears in both arrays.

---

## Example

Input:

```
nums1 = [1,2,2,1]
nums2 = [2,2]
```

Output:

```
[2,2]
```

---

## Example 2

Input:

```
nums1 = [4,9,5]
nums2 = [9,4,9,8,4]
```

Output:

```
[4,9]
```

or

```
[9,4]
```

---

## Intuition

Unlike LeetCode 349 (Intersection of Two Arrays),

here duplicates matter.

Example:

```
nums1 = [1,2,2,1]
nums2 = [2,2]
```

Since 2 appears twice in both arrays:

```
Answer = [2,2]
```

Store frequencies using a HashMap.

---

## Algorithm

1. Count frequencies of nums1.
2. Traverse nums2.
3. If frequency exists:
   - Add element to answer.
   - Decrease frequency.
4. Print result.

---

## Dry Run

Input:

```
nums1 = [1,2,2,1]
nums2 = [2,2]
```

Frequency Map:

```
1 → 2
2 → 2
```

Process nums2:

```
2 found
Answer = [2]
Freq(2) = 1

2 found
Answer = [2,2]
Freq(2) = 0
```

Output:

```
[2,2]
```

---

## Time Complexity

Building map:

```
O(n)
```

Traversal:

```
O(m)
```

Overall:

```
O(n + m)
```

---

## Space Complexity

HashMap stores frequencies.

```
O(min(n,m))
```

---

## Key Observation

Use frequencies instead of a HashSet because duplicates must be preserved.

---

## Difference from LeetCode 349

### 349 - Intersection of Two Arrays

```
Input:
[1,2,2,1]
[2,2]

Output:
[2]
```

Unique elements only.

Uses:

```
HashSet
```

---

### 350 - Intersection of Two Arrays II

```
Input:
[1,2,2,1]
[2,2]

Output:
[2,2]
```

Duplicates included.

Uses:

```
HashMap
```

---
