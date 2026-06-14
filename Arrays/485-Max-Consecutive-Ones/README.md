# Max Consecutive Ones

## Pattern

Array Traversal

---

## Problem

Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

---

## Example

Input:

```
nums = [1,1,0,1,1,1]
```

Output:

```
3
```

Explanation:

```
The first streak of 1s = 2
The second streak of 1s = 3
Maximum = 3
```

---

## Example 2

Input:

```
nums = [1,0,1,1,0,1]
```

Output:

```
2
```

---

## Intuition

We need to track the length of the current sequence of consecutive `1`s.

- If we encounter `1`, increase the count.
- If we encounter `0`, reset the count.
- Continuously update the maximum count.

---

## Algorithm

1. Initialize:
   - `count = 0`
   - `maxCount = 0`
2. Traverse the array.
3. If current element is `1`:
   - Increment `count`
   - Update `maxCount`
4. If current element is `0`:
   - Reset `count = 0`
5. Return `maxCount`.

---

## Dry Run

Input:

```
[1,1,0,1,1,1]
```

| Element | Count | MaxCount |
|----------|--------|----------|
| 1 | 1 | 1 |
| 1 | 2 | 2 |
| 0 | 0 | 2 |
| 1 | 1 | 2 |
| 1 | 2 | 2 |
| 1 | 3 | 3 |

Final Answer:

```
3
```

---

## Time Complexity

We traverse the array once.

```
O(n)
```

---

## Space Complexity

Only two variables are used:

```java
count
maxCount
```

Therefore:

```
O(1)
```

---

## Key Observation

Whenever a `0` appears, the current streak of consecutive `1`s breaks.

So we reset the counter and start counting again from the next `1`.

---
