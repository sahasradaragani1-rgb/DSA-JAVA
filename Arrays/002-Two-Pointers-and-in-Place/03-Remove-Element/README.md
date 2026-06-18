# Remove Element

## Pattern

Two Pointer

---

## Problem

Given an array and a value `val`, remove all occurrences of `val` in-place.

Return the number of remaining elements.

---

## Example

Input:

```
nums = [3,2,2,3]
val = 3
```

Output:

```
2
```

Array:

```
[2,2]
```

---

## Intuition

We don't actually need another array.

Maintain a pointer:

```
k
```

which represents the position where the next valid element should go.

Traverse the array:

- If element is not equal to val:
  - Put it at index k
  - Increase k

---

## Algorithm

1. Initialize:

```
k = 0
```

2. Traverse array.

3. If:

```
nums[i] != val
```

copy:

```
nums[k] = nums[i]
```

increment:

```
k++
```

4. First k elements are the answer.

---

## Dry Run

Input:

```
[3,2,2,3]
val = 3
```

Start:

```
k = 0
```

3:

```
skip
```

2:

```
nums[0] = 2
k = 1
```

2:

```
nums[1] = 2
k = 2
```

3:

```
skip
```

Result:

```
[2,2]
```

Length:

```
2
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

No extra array.

```
O(1)
```

---

## Key Observation

The array is modified in-place.

Only the first `k` elements matter.

---
