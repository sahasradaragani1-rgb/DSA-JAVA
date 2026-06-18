# Missing Number

## Pattern

Bit Manipulation (XOR)

---

## Problem

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing.

---

## Example

Input:

```
nums = [3,0,1]
```

Output:

```
2
```

Input:

```
nums = [0,1]
```

Output:

```
2
```

---

## Intuition

The array contains numbers from:

```
0 to n
```

with exactly one number missing.

Using XOR:

```
a ^ a = 0
a ^ 0 = a
```

All existing numbers cancel out.

The only remaining value is the missing number.

---

## Algorithm

1. Initialize:

```java
missing = n
```

2. Traverse the array.
3. XOR:
   - Current index
   - Current array element
4. After traversal, `missing` contains the answer.

---

## Dry Run

Input:

```
nums = [3,0,1]
```

Initial:

```
missing = 3
```

Iteration 1:

```
missing = 3 ^ 0 ^ 3 = 0
```

Iteration 2:

```
missing = 0 ^ 1 ^ 0 = 1
```

Iteration 3:

```
missing = 1 ^ 2 ^ 1 = 2
```

Final Answer:

```
2
```

---

## Why XOR Works

Expected numbers:

```
0 1 2 3
```

Array:

```
3 0 1
```

Combined XOR:

```
0 ^ 1 ^ 2 ^ 3 ^ 3 ^ 0 ^ 1
```

Cancelling duplicates:

```
2
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Only one variable is used:

```java
missing
```

Therefore:

```
O(1)
```

---

## Key Observation

Another approach uses the sum formula:

```
n × (n + 1) / 2
```

and subtracts the array sum.

That also gives:

```
O(n) Time
O(1) Space
```

However, XOR avoids potential integer overflow and is often considered the most elegant solution.

---
