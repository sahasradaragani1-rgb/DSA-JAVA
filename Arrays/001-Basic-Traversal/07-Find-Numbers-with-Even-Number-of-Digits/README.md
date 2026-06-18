# Find Numbers with Even Number of Digits

## Pattern

Digit Extraction

---

## Problem

Given an array of integers, return how many of them contain an even number of digits.

---

## Example 1

Input:

```
nums = [12,345,2,6,7896]
```

Output:

```
2
```

Explanation:

```
12   -> 2 digits
345  -> 3 digits
2    -> 1 digit
6    -> 1 digit
7896 -> 4 digits
```

Numbers with even digits:

```
12, 7896
```

Count:

```
2
```

---

## Example 2

Input:

```
nums = [555,901,482,1771]
```

Output:

```
1
```

---

## Intuition

For each number:

1. Count its digits.
2. Check:

```java
digits % 2 == 0
```

3. If true, increase answer.

---

## Algorithm

1. Traverse the array.
2. For every number:
   - Count digits using division by 10.
3. If digit count is even:
   - Increment answer.
4. Print answer.

---

## Dry Run

Input:

```
[12,345,2,6,7896]
```

Digit counts:

```
12   -> 2 ✓
345  -> 3 ✗
2    -> 1 ✗
6    -> 1 ✗
7896 -> 4 ✓
```

Answer:

```
2
```

---

## Time Complexity

For each number we count digits.

```
O(n * d)
```

where:

```
d = number of digits
```

Since digits are at most 10 for int values:

```
O(n)
```

---

## Space Complexity

No extra data structures used.

```
O(1)
```

---

## Key Observation

A number has an even number of digits if:

```java
digitCount % 2 == 0
```

---
