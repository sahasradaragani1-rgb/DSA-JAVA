# Sort an Array of 0's, 1's and 2's

## Pattern

Dutch National Flag Algorithm

---

## Problem

Given an array containing only:

```
0, 1, 2
```

sort the array in-place without using any sorting algorithm.

---

## Example

Input:

```
[2,0,2,1,1,0]
```

Output:

```
[0,0,1,1,2,2]
```

---

## Intuition

We divide the array into 4 regions:

```
0 ... low-1      -> 0s
low ... mid-1    -> 1s
mid ... high     -> Unknown
high+1 ... n-1   -> 2s
```

Use three pointers:

```java
low
mid
high
```

---

## Algorithm

### Case 1: nums[mid] == 0

Swap:

```java
nums[low]
nums[mid]
```

Move:

```java
low++
mid++
```

---

### Case 2: nums[mid] == 1

Already in correct position.

```java
mid++
```

---

### Case 3: nums[mid] == 2

Swap:

```java
nums[mid]
nums[high]
```

Move:

```java
high--
```

Do NOT increment mid.

---

## Dry Run

Input:

```
[2,0,2,1,1,0]
```

Initial:

```
low = 0
mid = 0
high = 5
```

Step 1:

```
2 found
swap(mid, high)

[0,0,2,1,1,2]
```

Step 2:

```
0 found
swap(low, mid)

[0,0,2,1,1,2]
```

Step 3:

```
0 found
```

Step 4:

```
2 found
swap(mid, high)
```

Final:

```
[0,0,1,1,2,2]
```

---

## Time Complexity

Each element is processed at most once.

```
Time Complexity = O(n)
```

---

## Space Complexity

Only pointers are used:

```java
low
mid
high
```

Therefore:

```
Space Complexity = O(1)
```

---

## Why Not Sorting?

Using:

```java
Arrays.sort(nums);
```

takes:

```
O(n log n)
```

But the problem can be solved in:

```
O(n)
```

because only three distinct values exist.

---

## Key Observation

The array contains only:

```
0,1,2
```

So instead of sorting, we partition the array into three regions.

This leads to the Dutch National Flag Algorithm.

---
