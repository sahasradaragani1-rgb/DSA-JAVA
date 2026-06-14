# Find the Number That Appears Once

## Pattern

Bit Manipulation (XOR)

---

## Problem

Given an array where every element appears exactly twice except one element, find the element that appears only once.

---

## Example

Input:

```
arr = [2,2,1]
```

Output:

```
1
```

Input:

```
arr = [4,1,2,1,2]
```

Output:

```
4
```

---

## Intuition

XOR has two important properties:

```
a ^ a = 0
```

```
a ^ 0 = a
```

Since every duplicate appears twice:

```
2 ^ 2 = 0
1 ^ 1 = 0
```

All duplicates cancel out.

Only the unique number remains.

---

## Algorithm

1. Initialize:

```java
single = 0
```

2. Traverse the array.
3. XOR every element with `single`.
4. Print the final value.

---

## Dry Run

Input:

```
[4,1,2,1,2]
```

Initial:

```
single = 0
```

Step 1:

```
0 ^ 4 = 4
```

Step 2:

```
4 ^ 1 = 5
```

Step 3:

```
5 ^ 2 = 7
```

Step 4:

```
7 ^ 1 = 6
```

Step 5:

```
6 ^ 2 = 4
```

Final Answer:

```
4
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
single
```

Therefore:

```
O(1)
```

---

## Key Observation

Using a HashMap would require:

```
O(n) Space
```

Using XOR:

```
O(1) Space
```

while maintaining:

```
O(n) Time
```

This makes XOR the optimal solution.

---
