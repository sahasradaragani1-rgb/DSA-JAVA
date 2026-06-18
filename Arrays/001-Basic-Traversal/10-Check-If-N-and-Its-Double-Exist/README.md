# Check If N and Its Double Exist

## Pattern

HashSet Lookup

---

## Problem

Given an array `arr` of integers, check if there exist two indices:

```
i != j
```

such that:

```
arr[i] = 2 * arr[j]
```

Return:

```
true
```

if such a pair exists, otherwise:

```
false
```

---

## Example 1

Input:

```
[10,2,5,3]
```

Output:

```
true
```

Explanation:

```
10 = 2 × 5
```

---

## Example 2

Input:

```
[3,1,7,11]
```

Output:

```
false
```

---

## Intuition

For every number:

```
num
```

we need to know whether:

```
2 * num
```

or

```
num / 2
```

already exists.

A HashSet provides:

```
O(1)
```

average lookup.

---

## Algorithm

1. Create a HashSet.
2. Traverse the array.
3. For every number:
   - Check if:
     ```java
     set.contains(2 * num)
     ```
   - Or:
     ```java
     num % 2 == 0 && set.contains(num / 2)
     ```
4. If found:
   - Return true.
5. Otherwise insert the number into the set.
6. Return false.

---

## Dry Run

Input:

```
[10,2,5,3]
```

Process:

```
10 -> add
2  -> add
5  -> set contains 10 ✓
```

Answer:

```
true
```

---

## Why Check num / 2?

Suppose:

```
[5,10]
```

When processing:

```
10
```

we need to know:

```
10 = 2 × 5
```

So checking:

```java
set.contains(num / 2)
```

helps detect pairs appearing in any order.

---

## Time Complexity

Array traversal:

```
O(n)
```

HashSet lookup:

```
O(1)
```

Overall:

```
O(n)
```

---

## Space Complexity

HashSet stores all elements.

```
O(n)
```

---

## Key Observation

For each element:

```java
2 * num
```

or

```java
num / 2
```

must already exist.

HashSet makes this check efficient.

---
