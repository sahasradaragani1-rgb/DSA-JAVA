# Longest Consecutive Sequence

## Pattern

HashSet

---

## Problem

Given an unsorted array of integers, return the length of the longest consecutive elements sequence.

The algorithm must run in:

```
O(n)
```

time.

---

## Example 1

Input:

```
nums = [100,4,200,1,3,2]
```

Output:

```
4
```

Explanation:

```
[1,2,3,4]
```

Length:

```
4
```

---

## Example 2

Input:

```
nums = [0,3,7,2,5,8,4,6,0,1]
```

Output:

```
9
```

Explanation:

```
[0,1,2,3,4,5,6,7,8]
```

---

## Intuition

Sorting gives:

```
O(n log n)
```

But the problem asks for:

```
O(n)
```

Use a HashSet for constant-time lookups.

The key idea:

A number starts a sequence only if:

```
num - 1
```

does not exist.

---

## Algorithm

1. Insert all elements into a HashSet.
2. Traverse the set.
3. If:
   ```
   num - 1
   ```
   is absent:
   - Start counting a sequence.
4. Keep extending:
   ```
   num + 1
   num + 2
   ...
   ```
5. Update longest length.

---

## Dry Run

Input:

```
[100,4,200,1,3,2]
```

Set:

```
{100,4,200,1,3,2}
```

Check:

```
100 -> start
length = 1

4 -> not start
(3 exists)

200 -> start
length = 1

1 -> start
2 exists
3 exists
4 exists

length = 4
```

Answer:

```
4
```

---

## Why Check (num - 1)?

Without this check:

```
1 -> count sequence
2 -> count sequence again
3 -> count sequence again
4 -> count sequence again
```

Many numbers get processed repeatedly.

The check ensures each sequence is counted only once.

---

## Time Complexity

Insert into HashSet:

```
O(n)
```

Traversal:

```
O(n)
```

Each number is visited at most once while extending sequences.

Overall:

```
O(n)
```

---

## Space Complexity

HashSet stores all elements:

```
O(n)
```

---

## Comparison

### Sorting Approach

```java
Arrays.sort(nums);
```

Time:

```
O(n log n)
```

Space:

```
O(1)
```

---

### HashSet Approach

Time:

```
O(n)
```

Space:

```
O(n)
```

Optimal

---

## Key Observation

Only begin counting when:

```java
!set.contains(num - 1)
```

This guarantees that every consecutive sequence is processed exactly once.

---
