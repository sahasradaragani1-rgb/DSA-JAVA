# Left Rotate Array by K Places

## Pattern

Array Reversal

---

## Problem

Given an array `arr` of size `n` and an integer `k`, rotate the array to the left by `k` positions.

---

## Example

Input:

```
arr = [1,2,3,4,5,6,7]
k = 3
```

Output:

```
[4,5,6,7,1,2,3]
```

---

## Intuition

A direct approach shifts elements one by one:

```
O(n × k)
```

Instead, use the reversal technique.

For:

```
[1,2,3,4,5,6,7]
k = 3
```

Split into:

```
[1,2,3] [4,5,6,7]
```

Reverse both parts and then reverse the entire array.

---

## Algorithm

1. Compute:

```
k = k % n
```

2. Reverse first `k` elements.
3. Reverse remaining `n-k` elements.
4. Reverse entire array.

---

## Dry Run

Input:

```
[1,2,3,4,5,6,7]
k = 3
```

Reverse first `k`:

```
[3,2,1,4,5,6,7]
```

Reverse remaining:

```
[3,2,1,7,6,5,4]
```

Reverse entire array:

```
[4,5,6,7,1,2,3]
```

Final Answer:

```
[4,5,6,7,1,2,3]
```

---

## Time Complexity

Three reversals:

```
O(n)
```

Overall:

```
Time Complexity = O(n)
```

---

## Space Complexity

Only a few variables are used:

- left
- right
- temp

Therefore:

```
Space Complexity = O(1)
```

---

## Key Observation

Instead of shifting elements repeatedly:

```
O(n × k)
```

the reversal technique rotates the array in:

```
O(n)
```

while using constant extra space.

---
