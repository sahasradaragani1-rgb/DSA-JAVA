# Left Rotate Array By One

## Pattern

Array Manipulation

---

## Problem

Given an array, rotate it to the left by one position.

---

## Example

Input:

```
arr = [1, 2, 3, 4, 5]
```

Output:

```
[2, 3, 4, 5, 1]
```

---

## Intuition

The first element moves to the last position.

All other elements shift one position to the left.

---

## Algorithm

1. Store the first element.
2. Shift all elements one position left.
3. Place the stored element at the last index.
4. Print the rotated array.

---

## Dry Run

Input:

```
[1, 2, 3, 4, 5]
```

Store:

```
first = 1
```

After shifting:

```
[2, 3, 4, 5, 5]
```

Place first at the end:

```
[2, 3, 4, 5, 1]
```

Final Answer:

```
[2, 3, 4, 5, 1]
```

---

## Time Complexity

We shift each element once.

```
n - 1 operations
```

Therefore:

```
Time Complexity = O(n)
```

---

## Space Complexity

Only one extra variable is used:

```java
first
```

Therefore:

```
Space Complexity = O(1)
```

---

## Key Observation

Only the first element is displaced permanently.

Saving it before shifting prevents data loss.

---
