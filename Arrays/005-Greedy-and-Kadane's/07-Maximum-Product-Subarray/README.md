# Maximum Product Subarray

## Pattern

Modified Kadane's Algorithm

---

## Problem

Given an integer array, find the contiguous subarray that has the largest product.

Return the maximum product.

---

## Example 1

Input:

```
[2,3,-2,4]
```

Output:

```
6
```

Explanation:

Subarray:

```
[2,3]
```

Product:

```
2 * 3 = 6
```

---

## Example 2

Input:

```
[-2,0,-1]
```

Output:

```
0
```

---

## Why Normal Kadane Does Not Work?

For maximum sum:

```
negative value always hurts
```

But for product:

```
negative × negative = positive
```

Example:

```
[-2,-3]
```

Product:

```
6
```

So we need to remember negative products too.

---

## Intuition

Maintain two values:

### Maximum product ending here

```
maxProd
```

### Minimum product ending here

```
minProd
```

Because:

```
negative * negative = positive
```

A small negative product can become the largest product later.

---

## Algorithm

For every element:

Calculate:

```
current element
current * maxProd
current * minProd
```

Choose:

```
maximum → new maxProd
minimum → new minProd
```

Update answer.

---

## Dry Run

Input:

```
[2,3,-2,4]
```

Start:

```
max = 2
min = 2
ans = 2
```

3:

```
max = 6
min = 3
ans = 6
```

-2:

```
max = -2
min = -12
```

4:

```
max = 4
ans = 6
```

Answer:

```
6
```

---

## Important Case

Input:

```
[-2,-3,4]
```

At -3:

```
max = 6
```

because:

```
(-2)*(-3)=6
```

This is why we track minimum.

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Only variables:

```
O(1)
```

---

## Difference From Kadane's Algorithm

Maximum Sum:

```
Only track maximum sum
```

Maximum Product:

```
Track maximum + minimum
```

because signs matter.

---
