# Largest Odd Number in String

## Pattern

Greedy / String

---

## Problem

Given a string representing a number.

Return the largest odd number that can be obtained from it by removing digits from the end.

---

## Example

Input:

```
354270
```

Output:

```
35427
```

---

## Observation

A number is odd only when:

```
last digit is odd
```

Odd digits:

```
1,3,5,7,9
```

---

## Brute Force

Try every substring.

Check if it is odd.

Find maximum.

Time:

```
O(n²)
```

---

## Optimal Idea

To make the number largest:

Keep the maximum possible prefix.

The first thing that matters is the last digit.

Find the rightmost odd digit.

Everything before it stays.

---

## Algorithm

Traverse from right:

```
n-1 → 0
```

Find:

```
odd digit
```

Return:

```
substring(0,index+1)
```

---

## Dry Run

Input:

```
42068
```

From right:

```
8 ❌
6 ❌
0 ❌
2 ❌
4 ❌
```

No odd digit.

Answer:

```
No odd number exists
```

---

Input:

```
1234567
```

Rightmost odd:

```
7
```

Answer:

```
1234567
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Substring storage:

```
O(n)
```

---
