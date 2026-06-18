# Longest Subarray With Sum K (Positive Numbers)

## Pattern

Sliding Window

---

## Problem

Given an array containing only positive integers,
find the length of the longest subarray whose sum equals `k`.

---

## Example

Input:

```
[1,2,3,1,1,1,1]
k = 3
```

Output:

```
3
```

Explanation:

Subarray:

```
[1,1,1]
```

has sum:

```
3
```

Length:

```
3
```

---

## Intuition

Because all numbers are positive:

If we expand the window:

```
sum increases
```

If we shrink the window:

```
sum decreases
```

This monotonic behavior allows sliding window.

---

## Algorithm

Maintain:

```
left = start of window
right = end of window
sum = current window sum
```

1. Expand window:

```
sum += arr[right]
```

2. If:

```
sum > k
```

shrink:

```
sum -= arr[left]
left++
```

3. If:

```
sum == k
```

update maximum length.

---

## Dry Run

Input:

```
[1,2,3,1,1]
k = 5
```

Window:

```
[1,2]
sum = 3
```

Expand:

```
[1,2,3]
sum = 6
```

Too large:

Remove 1:

```
[2,3]
sum = 5
```

Length:

```
2
```

Continue...

Answer:

```
2
```

---

## Time Complexity

Each element enters and leaves window once.

```
O(n)
```

---

## Space Complexity

Only variables used:

```
O(1)
```

---

## Important Note

Sliding window works only when:

```
All numbers are positive
```

For arrays containing:

```
negative numbers
```

use:

```
Prefix Sum + HashMap
```

---
