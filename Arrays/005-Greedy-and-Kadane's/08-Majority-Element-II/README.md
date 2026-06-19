# Majority Element II

## Pattern

Boyer Moore Voting Algorithm

---

## Problem

Given an integer array `nums`.

Find all elements that appear more than:

```
n / 3
```

times.

Return all such elements.

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

Explanation:

Array size:

```
n = 3
```

n/3:

```
1
```

3 appears 2 times.

---

## Example 2

Input:

```
[1,2,3,1,2,1]
```

Output:

```
1
```

---

## Important Observation

For majority element:

```
frequency > n/2
```

There can be only one answer.

For:

```
frequency > n/3
```

There can be at most two answers.

Why?

Because:

```
3 elements each with frequency > n/3

would exceed n
```

---

## Brute Force

Count frequency of every element.

Using HashMap:

Time:

```
O(n)
```

Space:

```
O(n)
```

---

## Optimal Idea

Use Boyer Moore Voting.

Maintain two candidates:

```
candidate1
candidate2
```

and their counts:

```
count1
count2
```

---

## Algorithm

1. Find possible candidates.

2. When current number matches a candidate:

Increase count.

3. If a count becomes zero:

Replace candidate.

4. If both candidates are different:

Decrease both counts.

5. Verify candidates by counting again.

---

## Dry Run

Input:

```
[2,2,1,3,2,1,1]
```

Candidates:

```
2
1
```

Verification:

```
2 appears 3 times
1 appears 3 times
```

n = 7

n/3 = 2

Both:

```
3 > 2
```

Answer:

```
[2,1]
```

---

## Why Two Candidates?

For n/3:

Maximum possible majority elements:

```
2
```

because:

```
3 * (n/3) = n
```

Three such elements cannot exist.

---

## Time Complexity

Two traversals:

```
O(n)
```

---

## Space Complexity

Only variables:

```
O(1)
```

---

## Difference

| Problem | Threshold | Candidates |
|---|---|---|
| Majority Element I | n/2 | 1 |
| Majority Element II | n/3 | 2 |

---
