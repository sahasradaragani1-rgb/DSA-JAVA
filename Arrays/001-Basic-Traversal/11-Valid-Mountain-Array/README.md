# Valid Mountain Array

## Pattern

Array Traversal

---

## Problem

An array is a mountain array if:

1. Length ≥ 3
2. Strictly increasing
3. Reaches one peak
4. Strictly decreasing

Return:

```
true
```

if it is a mountain array, otherwise:

```
false
```

---

## Example 1

Input:

```
[2,1]
```

Output:

```
false
```

---

## Example 2

Input:

```
[3,5,5]
```

Output:

```
false
```

Reason:

```
Not strictly increasing.
```

---

## Example 3

Input:

```
[0,3,2,1]
```

Output:

```
true
```

---

## Intuition

A valid mountain has:

```text
Increasing Part
      ↑
      Peak
      ↓
Decreasing Part
```

We first move upward to the peak, then downward.

---

## Algorithm

1. Start from index 0.
2. Move while:

```java
arr[i] < arr[i + 1]
```

3. Peak must not be:
   - First element
   - Last element

4. Move while:

```java
arr[i] > arr[i + 1]
```

5. If we reach the last index:

```java
true
```

otherwise:

```java
false
```

---

## Dry Run

Input:

```
[0,3,2,1]
```

Increasing:

```
0 → 3
```

Peak:

```
3
```

Decreasing:

```
3 → 2 → 1
```

Reached end.

Output:

```
true
```

---

## Edge Cases

### Peak at Beginning

```
[5,4,3,2]
```

Invalid

---

### Peak at End

```
[1,2,3,4]
```

Invalid

---

### Equal Adjacent Elements

```
[1,2,2,1]
```

Invalid

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

No extra data structure used.

```
O(1)
```

---

## Key Observation

A mountain array must have exactly one peak and both sides must be strictly monotonic.

---
