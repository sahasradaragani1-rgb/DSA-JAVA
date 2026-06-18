# Plus One

## Pattern

Array Traversal

---

## Problem

You are given a large integer represented as an integer array `digits`.

Each element contains a single digit.

Increment the integer by one and return the resulting array of digits.

---

## Example

Input:

```
digits = [1,2,3]
```

Output:

```
[1,2,4]
```

Input:

```
digits = [4,3,2,1]
```

Output:

```
[4,3,2,2]
```

Input:

```
digits = [9,9,9]
```

Output:

```
[1,0,0,0]
```

---

## Intuition

Addition starts from the last digit.

If the current digit is less than 9:

```
Increment it and stop.
```

If the current digit is 9:

```
Make it 0 and carry 1.
```

If every digit is 9:

```
Create a new array with one extra digit.
```

---

## Algorithm

1. Traverse the array from right to left.
2. If current digit is less than 9:
   - Increment it.
   - Return the array.
3. Otherwise:
   - Set current digit to 0.
4. If loop finishes:
   - Create a new array of size n+1.
   - Put 1 at index 0.
   - Return it.

---

## Dry Run

Input:

```
digits = [1,2,9]
```

Start from last digit:

```
[1,2,9]
      ↑
```

9 becomes:

```
[1,2,0]
```

Carry goes left.

Increment 2:

```
[1,3,0]
```

Final Answer:

```
[1,3,0]
```

---

## Dry Run 2

Input:

```
digits = [9,9,9]
```

After processing:

```
[0,0,0]
```

All digits were 9.

Create:

```
[1,0,0,0]
```

Final Answer:

```
[1,0,0,0]
```

---

## Time Complexity

Worst case:

```
[9,9,9,9,9]
```

We traverse all digits once.

```
O(n)
```

---

## Space Complexity

Normal case:

```
O(1)
```

Extra space.

In the worst case, a new array of size `n + 1` is created.

LeetCode considers this output array as part of the answer, so:

```
Space Complexity = O(1)
```

Auxiliary Space.

---

## Key Observation

Instead of converting the array into a number:

```
123 -> 124
```

which may overflow for very large inputs,

we simulate the addition exactly the way we do it by hand.

---
