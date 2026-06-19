# Merge Overlapping Intervals

## Pattern

Sorting + Greedy

---

## Problem

Given an array of intervals.

Merge all overlapping intervals.

Return the non-overlapping intervals.

---

## Example

Input:

```
[1,3]
[2,6]
[8,10]
[15,18]
```

Output:

```
[1,6]
[8,10]
[15,18]
```

---

## Observation

Two intervals overlap when:

```
next.start <= current.end
```

Example:

```
[1,5]
[3,7]
```

They overlap because:

```
3 <= 5
```

Merge:

```
[1,7]
```

---

## Brute Force

Compare every pair.

Merge repeatedly.

Time:

```
O(n²)
```

---

## Optimal Idea

Sort intervals by starting point.

After sorting:

```
smaller start comes first
```

Now only compare with the previous merged interval.

---

## Algorithm

1. Sort intervals:

```
start increasing
```

2. Take first interval.

3. For every next interval:

If:

```
next.start <= current.end
```

merge:

```
end = max(end, next.end)
```

Else:

store current interval.

4. Add last interval.

---

## Dry Run

Input:

```
[1,3]
[2,6]
[8,10]
```

Sorted:

```
[1,3]
[2,6]
[8,10]
```

Compare:

```
2 <= 3
```

Merge:

```
[1,6]
```

Next:

```
8 > 6
```

Store:

```
[1,6]
```

Final:

```
[1,6],[8,10]
```

---

## Time Complexity

Sorting:

```
O(n log n)
```

Traversal:

```
O(n)
```

Overall:

```
O(n log n)
```

---

## Space Complexity

Output list:

```
O(n)
```

---
