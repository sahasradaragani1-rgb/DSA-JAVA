# Subarray Sum Equals K

## Pattern

Prefix Sum + HashMap

---

## Problem

Given an integer array and an integer `k`,
return the total number of continuous subarrays whose sum equals `k`.

---

## Example 1

Input:

```text
nums = [1,1,1]
k = 2
```

Output:

```text
2
```

Explanation:

Subarrays:

```text
[1,1]
[1,1]
```

---

## Example 2

Input:

```text
nums = [1,2,3]
k = 3
```

Output:

```text
2
```

Subarrays:

```text
[1,2]
[3]
```

---

## Intuition

For any index:

```text
Current Prefix Sum = sum
```

We need a previous prefix sum:

```text
sum - previous = k
```

Therefore:

```text
previous = sum - k
```

If `sum - k` exists, then a valid subarray exists.

---

## Algorithm

1. Create HashMap:

```text
prefixSum → frequency
```

2. Initialize:

```java
map.put(0, 1);
```

This handles subarrays starting from index 0.

3. Traverse array.

4. Update:

```java
sum += nums[i];
```

5. Check:

```java
count += map.get(sum - k);
```

6. Store current prefix sum frequency.

---

## Dry Run

Input:

```text
[1,1,1]
k = 2
```

Start:

```text
map = {0=1}
sum = 0
count = 0
```

First 1:

```text
sum = 1
sum-k = -1
Not found
```

Store:

```text
1 → 1
```

Second 1:

```text
sum = 2
sum-k = 0
Found once
count = 1
```

Store:

```text
2 → 1
```

Third 1:

```text
sum = 3
sum-k = 1
Found once
count = 2
```

Answer:

```text
2
```

---

## Why Frequency?

Consider:

```text
[1,-1,1,-1]
```

The same prefix sum may occur multiple times.

Each occurrence can create a valid subarray.

Therefore store:

```text
frequency
```

not just index.

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

## Difference from Longest Subarray Sum K

### Longest Length

Store:

```text
prefixSum → first index
```

Goal:

```text
maximum length
```

---

### Count Subarrays

Store:

```text
prefixSum → frequency
```

Goal:

```text
total count
```

---
