# Replace Elements with Greatest Element on Right Side

## Pattern

Traversal from Right

---

## Problem

Given an array, replace every element with the greatest element among the elements to its right.

The last element should be replaced with:

```
-1
```

---

## Example

Input:

```
[17,18,5,4,6,1]
```

Output:

```
[18,6,6,6,1,-1]
```

---

## Intuition

For every index:

```
arr[i]
```

we need the maximum element on its right.

Brute force would check all right-side elements repeatedly:

```
O(n²)
```

Instead, traverse from right to left while maintaining:

```java
maxRight
```

---

## Algorithm

1. Initialize:

```java
maxRight = -1
```

2. Traverse from right to left.
3. Store current value.
4. Replace current element with maxRight.
5. Update:

```java
maxRight = Math.max(maxRight, current)
```

---

## Dry Run

Input:

```
[17,18,5,4,6,1]
```

Start:

```
maxRight = -1
```

Process:

```
1  -> replace with -1
maxRight = 1

6  -> replace with 1
maxRight = 6

4  -> replace with 6
maxRight = 6

5  -> replace with 6
maxRight = 6

18 -> replace with 6
maxRight = 18

17 -> replace with 18
```

Result:

```
[18,6,6,6,1,-1]
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

No extra array used.

```
O(1)
```

---

## Key Observation

While moving from right to left:

```java
maxRight
```

always stores the greatest element seen so far on the right side.

---
