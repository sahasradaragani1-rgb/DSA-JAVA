# Largest Subarray With Sum 0

## Pattern

Prefix Sum + HashMap

---

## Problem

Given an array containing positive, negative and zero values, find the length of the largest subarray having sum equal to 0.

---

## Example

Input:

```text
[15,-2,2,-8,1,7,10,23]
```

Output:

```text
5
```

Explanation:

Subarray:

```text
[-2,2,-8,1,7]
```

Sum:

```text
0
```

Length:

```text
5
```

---

## Intuition

Suppose:

```text
Prefix Sum at i = X
Prefix Sum at j = X
```

Then:

```text
Sum(i+1 ... j) = 0
```

Because:

```text
X - X = 0
```

Therefore whenever the same prefix sum appears again,
the elements between them form a zero-sum subarray.

---

## Algorithm

1. Maintain running prefix sum.

2. If:

```text
sum == 0
```

then subarray from:

```text
0 to i
```

has sum 0.

3. Store first occurrence of every prefix sum.

4. If same prefix sum appears again:

```text
length = currentIndex - firstIndex
```

5. Update maximum length.

---

## Dry Run

Input:

```text
[1,2,-3,3]
```

Prefix sums:

```text
1
3
0
3
```

At index 2:

```text
sum = 0
```

Length:

```text
3
```

At index 3:

```text
sum = 3
```

Already seen at index 1.

Length:

```text
3 - 1 = 2
```

Maximum:

```text
3
```

---

## Time Complexity

Single traversal:

```text
O(n)
```

---

## Space Complexity

HashMap stores prefix sums.

```text
O(n)
```

---

## Key Observation

If two prefix sums are equal:

```text
prefix[j] - prefix[i] = 0
```

Hence the subarray between them has sum 0.

---
