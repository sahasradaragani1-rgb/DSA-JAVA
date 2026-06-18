# Longest Subarray With Sum K (Negative Numbers)

## Pattern

Prefix Sum + HashMap

---

## Problem

Given an array containing:

- positive numbers
- negative numbers
- zeroes

Find the length of the longest subarray whose sum is exactly `k`.

---

## Example

Input:

```
[1,-1,5,-2,3]
k = 3
```

Output:

```
4
```

Explanation:

Subarray:

```
[1,-1,5,-2]
```

Sum:

```
1-1+5-2 = 3
```

Length:

```
4
```

---

## Why Not Sliding Window?

Sliding window works only when:

```
all numbers are positive
```

Example:

```
[2,-1,2]
```

The sum can increase or decrease unpredictably.

So we use prefix sum.

---

## Intuition

Prefix sum:

```
sum[i] = arr[0] + arr[1] + ... + arr[i]
```

For a subarray:

```
i to j
```

sum is:

```
prefix[j] - prefix[i-1]
```

We need:

```
prefix[j] - prefix[i-1] = k
```

Rearrange:

```
prefix[i-1] = prefix[j] - k
```

So while traversing:

If:

```
currentSum - k
```

exists in HashMap,

we found a valid subarray.

---

## Algorithm

1. Create HashMap:

```
prefixSum → first index
```

2. Maintain:

```
sum = current prefix sum
```

3. For every element:

Update:

```
sum += arr[i]
```

4. Check:

```
sum - k exists?
```

If yes:

```
length = i - storedIndex
```

5. Store prefix sum only if seen first time.

---

## Dry Run

Input:

```
[1,-1,5,-2,3]
k = 3
```

Prefix sums:

```
1
0
5
3
6
```

At index 3:

```
sum = 3
```

Need:

```
3 - 3 = 0
```

0 exists at index 1.

Length:

```
3 - 1 = 2
```

Continue...

Maximum:

```
4
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

HashMap stores prefix sums:

```
O(n)
```

---

## Key Observation

Store the FIRST occurrence of every prefix sum.

Why?

Earlier index gives maximum possible length.

---

## Comparison

### Positive numbers only

Sliding Window:

```
Time: O(n)
Space: O(1)
```

---

### Positive + Negative numbers

Prefix Sum:

```
Time: O(n)
Space: O(n)
```

---
