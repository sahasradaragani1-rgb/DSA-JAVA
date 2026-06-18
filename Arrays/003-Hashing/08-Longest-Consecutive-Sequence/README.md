# Longest Consecutive Sequence

## Pattern

HashSet

---

## Problem

Given an unsorted array of integers, return the length of the longest consecutive elements sequence.

The solution must run in:

```
O(n)
```

time.

---

## Example 1

Input:

```
[100,4,200,1,3,2]
```

Output:

```
4
```

Explanation:

```
Sequence:
1,2,3,4
```

Length:

```
4
```

---

## Example 2

Input:

```
[0,3,7,2,5,8,4,6,0,1]
```

Output:

```
9
```

Explanation:

```
0,1,2,3,4,5,6,7,8
```

Length:

```
9
```

---

## Intuition

Sorting would give:

```
O(n log n)
```

But the problem requires:

```
O(n)
```

Use a HashSet for constant-time lookups.

Only start counting from numbers that are the beginning of a sequence.

---

## Algorithm

1. Insert all elements into a HashSet.
2. Traverse the set.
3. If:

```
num - 1
```

does not exist:

Start a new sequence.

4. Keep checking:

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

The check ensures every sequence is counted exactly once.

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

Overall:

```
O(n)
```

---

## Space Complexity

HashSet stores all elements.

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

✅ Optimal

---

## Key Observation

A number starts a sequence only when:

```java
!set.contains(num - 1)
```

This prevents duplicate work and guarantees linear time.

---
