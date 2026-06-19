# 3Sum

## Pattern

Sorting + Two Pointer

---

## Problem

Given an integer array.

Find all unique triplets:

```
[a,b,c]
```

such that:

```
a + b + c = 0
```

---

## Example

Input:

```
[-1,0,1,2,-1,-4]
```

Output:

```
[-1,-1,2]
[-1,0,1]
```

---

## Brute Force

Try every combination of 3 elements.

Number of combinations:

```
nC3
```

Time:

```
O(n³)
```

---

## Optimal Idea

Sort the array.

Example:

```
[-4,-1,-1,0,1,2]
```

Fix one element.

Then solve:

```
two sum
```

on the remaining part.

---

## Algorithm

1. Sort array.

2. Loop through each element:

```
nums[i]
```

3. Set:

```
left = i+1
right = n-1
```

4. Calculate:

```
nums[i]+nums[left]+nums[right]
```

If:

```
sum == 0
```

store answer.

If:

```
sum < 0
```

increase left.

If:

```
sum > 0
```

decrease right.

---

## Dry Run

Input:

```
[-1,0,1,2,-1,-4]
```

Sorted:

```
[-4,-1,-1,0,1,2]
```

Fix:

```
-1
```

Two pointers:

```
-1 + 0 + 1 = 0
```

Store:

```
[-1,0,1]
```

Next:

```
-1 + -1 + 2 = 0
```

Store:

```
[-1,-1,2]
```

---

## Duplicate Handling

Important:

Skip same values:

```
nums[i] == nums[i-1]
```

and after finding answer:

move over duplicate left/right values.

---

## Time Complexity

Sorting:

```
O(n log n)
```

Two pointer:

```
O(n²)
```

Overall:

```
O(n²)
```

---

## Space Complexity

No extra data structure:

```
O(1)
```

(excluding output)

---
