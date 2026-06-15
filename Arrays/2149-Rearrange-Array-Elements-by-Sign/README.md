# Rearrange Array Elements by Sign

## Pattern

Array Placement

---

## Problem

Given an array containing an equal number of positive and negative integers, rearrange the array such that:

- Positive and negative numbers alternate.
- The relative order of positives is maintained.
- The relative order of negatives is maintained.
- The array starts with a positive number.

---

## Example

Input:

```
nums = [3,1,-2,-5,2,-4]
```

Output:

```
[3,-2,1,-5,2,-4]
```

---

## Intuition

Since:

```
Positive → Even Index
Negative → Odd Index
```

we can directly place elements into their correct positions.

Maintain:

```java
pos = 0
neg = 1
```

---

## Algorithm

1. Create result array.
2. Maintain:
   - pos = 0
   - neg = 1
3. Traverse original array.
4. If positive:
   - Place at pos
   - pos += 2
5. If negative:
   - Place at neg
   - neg += 2
6. Print result.

---

## Dry Run

Input:

```
[3,1,-2,-5,2,-4]
```

Processing:

```
3  -> index 0
1  -> index 2
-2 -> index 1
-5 -> index 3
2  -> index 4
-4 -> index 5
```

Result:

```
[3,-2,1,-5,2,-4]
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Result array:

```
O(n)
```

---

## Key Observation

The problem guarantees:

```
Number of positives = Number of negatives
```

Therefore every positive can occupy an even index and every negative can occupy an odd index.

---
