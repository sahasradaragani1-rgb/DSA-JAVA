# Duplicate Zeros

## Pattern

Two Pointer

---

## Problem

Given a fixed-length integer array, duplicate each occurrence of zero.

Shift remaining elements to the right.

Elements beyond the array length are discarded.

Modify the array in-place.

---

## Example 1

Input:

```text
[1,0,2,3,0,4,5,0]
```

Output:

```text
[1,0,0,2,3,0,0,4]
```

---

## Example 2

Input:

```text
[1,2,3]
```

Output:

```text
[1,2,3]
```

---

## Intuition

Brute force shifting every time we find a zero causes:

```text
O(n²)
```

Instead:

1. Count zeros.
2. Imagine a larger virtual array.
3. Fill from the end to avoid overwriting.

---

## Algorithm

1. Count total zeros.

2. Set:

```java
i = n - 1
j = n + zeros - 1
```

3. Traverse backwards.

4. Copy current element.

5. If element is zero:

```java
duplicate it
```

6. Continue until array is processed.

---

## Dry Run

Input:

```text
[1,0,2,3]
```

Zeros:

```text
1
```

Virtual size:

```text
5
```

Pointers:

```text
i = 3
j = 4
```

Process backwards:

```text
1,0,2,3
```

After duplication:

```text
1,0,0,2
```

---

## Time Complexity

Count zeros:

```text
O(n)
```

Backward traversal:

```text
O(n)
```

Overall:

```text
O(n)
```

---

## Space Complexity

No extra array used.

```text
O(1)
```

---

## Key Observation

Moving from the end prevents overwriting elements that are still needed.

---
