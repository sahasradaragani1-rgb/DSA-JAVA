# Majority Element

## Pattern

Moore's Voting Algorithm

---

## Problem

Given an array of size `n`, find the element that appears more than:

```
n / 2
```

times.

It is guaranteed that a majority element exists.

---

## Example 1

Input:

```
nums = [3,2,3]
```

Output:

```
3
```

---

## Example 2

Input:

```
nums = [2,2,1,1,1,2,2]
```

Output:

```
2
```

---

## Intuition

Since the majority element appears more than half the time:

```
count(majority) > n/2
```

it can never be completely cancelled by other elements.

Moore's Voting uses this idea.

---

## Algorithm

Maintain:

```java
candidate
count
```

### Rules

If:

```java
count == 0
```

choose current element as candidate.

If:

```java
num == candidate
```

increase count.

Else:

```java
count--
```

At the end, candidate will be the majority element.

---

## Dry Run

Input:

```
[2,2,1,1,1,2,2]
```

| Element | Candidate | Count |
|----------|------------|--------|
| 2 | 2 | 1 |
| 2 | 2 | 2 |
| 1 | 2 | 1 |
| 1 | 2 | 0 |
| 1 | 1 | 1 |
| 2 | 1 | 0 |
| 2 | 2 | 1 |

Final Answer:

```
2
```

---

## Why It Works

Think of:

```
Majority Element = +1
Other Elements = -1
```

Whenever different elements meet:

```
They cancel each other.
```

Since the majority element occurs more than:

```
n/2 times
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

Only two variables:

```java
candidate
count
```

Therefore:

```
O(1)
```

---

## Comparison

### HashMap Approach

```java
HashMap<Integer,Integer>
```

Time:

```
O(n)
```

Space:

```
O(n)
```

### Moore's Voting

Time:

```
O(n)
```

Space:

```
O(1)
```

Optimal

---

## Key Observation

A majority element can never be completely eliminated by pairwise cancellation because it appears more than all other elements combined.

---
