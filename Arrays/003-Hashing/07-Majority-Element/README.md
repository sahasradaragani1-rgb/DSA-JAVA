# Majority Element

## Pattern

Boyer-Moore Voting Algorithm

---

## Problem

Given an array of size n, find the element that appears more than:

```
n / 2
```

times.

You may assume that the majority element always exists.

---

## Example 1

Input:

```
[3,2,3]
```

Output:

```
3
```

---

## Example 2

Input:

```
[2,2,1,1,1,2,2]
```

Output:

```
2
```

---

## Intuition

A majority element occurs more than half the time.

Whenever we encounter:

```
majority element
```

it can cancel out one occurrence of any other element.

Since the majority element appears more than:

```
n/2
```

it can never be completely cancelled.

---

## Algorithm

1. Initialize:

```
candidate = 0
count = 0
```

2. Traverse array.

3. If:

```
count == 0
```

choose current element as candidate.

4. If current element equals candidate:

```
count++
```

Else:

```
count--
```

5. Final candidate is the majority element.

---

## Dry Run

Input:

```
[2,2,1,1,1,2,2]
```

Process:

```
2 → candidate=2 count=1
2 → count=2
1 → count=1
1 → count=0
1 → candidate=1 count=1
2 → count=0
2 → candidate=2 count=1
```

Answer:

```
2
```

---

## Why Does It Work?

Think of it as cancellation.

```
2 cancels 1
2 cancels 1
2 cancels 1
```

Since the majority element appears more than:

```
n/2
```

it survives all cancellations.

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Only two variables used:

```
O(1)
```

---

## Comparison

### HashMap

Count frequencies.

```
Time: O(n)
Space: O(n)
```

---

### Boyer-Moore Voting

```
Time: O(n)
Space: O(1)
```

Optimal

---

## Key Observation

The majority element has more occurrences than all other elements combined.

Therefore it remains after pairwise cancellation.

---
