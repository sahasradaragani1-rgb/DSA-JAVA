# Array Partition

## Pattern

Sorting + Greedy

---

## Problem

Given an integer array of `2n` elements.

Partition the array into `n` pairs:

```
(a1,b1), (a2,b2) ...
```

Maximize:

```
min(a1,b1) + min(a2,b2) + ... + min(an,bn)
```

Return the maximum sum.

---

## Example 1

Input:

```
[1,4,3,2]
```

Output:

```
4
```

Explanation:

Possible pairs:

```
(1,4)
(3,2)
```

Minimums:

```
1 + 2 = 3
```

Better:

```
(1,2)
(3,4)
```

Minimums:

```
1 + 3 = 4
```

Answer:

```
4
```

---

## Brute Force

Try every possible pairing.

Find maximum minimum sum.

Very expensive.

Time:

```
O(n!)
```

---

## Optimal Idea

Sort the array.

Example:

```
[1,2,3,4]
```

Pair:

```
(1,2)
(3,4)
```

Take minimums:

```
1 + 3
```

Why?

The smaller values should be paired with the closest larger values so they are not wasted.

---

## Algorithm

1. Sort array.

2. Traverse by 2:

```
i = 0,2,4...
```

3. Add:

```
nums[i]
```

because it is the minimum of each pair.

---

## Dry Run

Input:

```
[1,4,3,2]
```

Sort:

```
[1,2,3,4]
```

Pairs:

```
(1,2)
(3,4)
```

Sum:

```
1 + 3 = 4
```

---

## Time Complexity

Sorting:

```
O(n log n)
```

Traversal:

```
O(n)
```

Overall:

```
O(n log n)
```

---

## Space Complexity

Sorting uses:

```
O(1)
```

(extra space depends on language sorting)

---

## Key Observation

After sorting:

```
smallest + third smallest + fifth smallest...
```

gives maximum answer.

---
