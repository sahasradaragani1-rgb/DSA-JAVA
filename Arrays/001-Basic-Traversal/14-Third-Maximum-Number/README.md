# Third Maximum Number

## Pattern

Array Traversal

---

## Problem

Given an integer array, return the third distinct maximum number.

If the third maximum does not exist, return the maximum number.

---

## Example 1

Input:

```
[3,2,1]
```

Output:

```
1
```

Explanation:

```
First maximum = 3
Second maximum = 2
Third maximum = 1
```

---

## Example 2

Input:

```
[1,2]
```

Output:

```
2
```

Only two distinct numbers exist.

---

## Example 3

Input:

```
[2,2,3,1]
```

Output:

```
1
```

Distinct numbers:

```
3,2,1
```

---

## Intuition

Sorting solution:

```
O(n log n)
```

But we can do it in one pass.

Maintain:

```
first  = largest
second = second largest
third  = third largest
```

Update them while traversing.

---

## Algorithm

1. Initialize:

```
first = -∞
second = -∞
third = -∞
```

2. Traverse the array.

3. For every number:

If it is already present:

```
skip
```

Otherwise update:

```
number > first
```

Shift:

```
third = second
second = first
first = number
```

Else if:

```
number > second
```

Update second.

Else if:

```
number > third
```

Update third.

4. If third does not exist, return first.

---

## Dry Run

Input:

```
[3,2,1]
```

Start:

```
first = -∞
second = -∞
third = -∞
```

3:

```
first = 3
```

2:

```
second = 2
```

1:

```
third = 1
```

Answer:

```
1
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Only three variables used:

```
O(1)
```

---

## Why Long?

Integer range:

```
-2^31 to 2^31-1
```

Using:

```
Long.MIN_VALUE
```

avoids confusion when the array contains:

```
-2147483648
```
