# Longest Subarray With Given Sum K

## Pattern

Prefix Sum + HashMap

---

## Problem

Given an array and an integer `k`, find the length of the longest subarray whose sum equals `k`.

---

## Example

Input:

```
arr = [1,2,3,1,1,1,1]
k = 6
```

Output:

```
4
```

Explanation:

```
[3,1,1,1]
```

has sum = 6 and length = 4.

---

## Intuition

Brute force checks every possible subarray:

```
O(n²)
```

Instead, use Prefix Sum.

If:

```
currentPrefixSum - previousPrefixSum = k
```

then:

```
Subarray Sum = k
```

So we need to find:

```
prefixSum - k
```

in constant time.

HashMap helps achieve this.

---

## Algorithm

1. Create a HashMap storing:
   - Prefix Sum → First Index
2. Traverse the array.
3. Update prefix sum.
4. If prefix sum equals k:
   - Update answer.
5. Check if:
   ```
   prefixSum - k
   ```
   exists in map.
6. Update maximum length.
7. Store first occurrence of each prefix sum.

---

## Dry Run

Input:

```
arr = [1,2,3,1,1,1,1]
k = 6
```

| Index | Value | Prefix Sum |
|---------|---------|---------|
| 0 | 1 | 1 |
| 1 | 2 | 3 |
| 2 | 3 | 6 |
| 3 | 1 | 7 |
| 4 | 1 | 8 |
| 5 | 1 | 9 |
| 6 | 1 | 10 |

At index 5:

```
prefixSum = 9
```

Need:

```
9 - 6 = 3
```

3 exists at index 1.

Length:

```
5 - 1 = 4
```

Answer:

```
4
```

---

## Time Complexity

Single traversal:

```
O(n)
```

HashMap operations:

```
containsKey() → O(1)
put() → O(1)
get() → O(1)
```

Therefore:

```
Time Complexity = O(n)
```

---

## Space Complexity

HashMap may store up to:

```
n prefix sums
```

Therefore:

```
Space Complexity = O(n)
```

---

## Key Observation

If:

```
prefixSum(i) - prefixSum(j) = k
```

then:

```
Subarray(j+1 ... i) has sum k
```

This converts a subarray problem into a HashMap lookup problem.

---
