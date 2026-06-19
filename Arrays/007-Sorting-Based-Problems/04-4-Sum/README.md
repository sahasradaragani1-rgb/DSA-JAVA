# 4Sum

## Pattern

Sorting + Two Pointer

---

## Problem

Given an integer array and a target.

Find all unique quadruplets:

```
[a,b,c,d]
```

such that:

```
a+b+c+d = target
```

---

## Example

Input:

```
nums = [1,0,-1,0,-2,2]
target = 0
```

Output:

```
[-2,-1,1,2]
[-2,0,0,2]
[-1,0,0,1]
```

---

## Brute Force

Try every combination of 4 elements.

Combinations:

```
nC4
```

Time:

```
O(n⁴)
```

---

## Optimal Idea

Reduce 4Sum into:

```
Fix two elements
+
Solve Two Sum
```

Steps:

1. Sort array.

2. Pick first number:

```
i
```

3. Pick second number:

```
j
```

4. Use two pointers:

```
left = j+1
right = n-1
```

---

## Algorithm

For every:

```
i
```

and:

```
j
```

calculate:

```
sum = nums[i]+nums[j]+nums[left]+nums[right]
```

If:

```
sum == target
```

Store answer.

If:

```
sum < target
```

move left.

If:

```
sum > target
```

move right.

---

## Duplicate Handling

Skip duplicate values:

For i:

```
nums[i] == nums[i-1]
```

For j:

```
nums[j] == nums[j-1]
```

After finding answer:

Move left/right over duplicates.

---

## Dry Run

Input:

```
[1,0,-1,0,-2,2]
target=0
```

Sorted:

```
[-2,-1,0,0,1,2]
```

Fix:

```
-2,-1
```

Need:

```
3
```

Two pointer finds:

```
1+2
```

Answer:

```
[-2,-1,1,2]
```

---

## Time Complexity

Two loops:

```
O(n²)
```

Two pointer:

```
O(n)
```

Overall:

```
O(n³)
```

---

## Space Complexity

Extra variables:

```
O(1)
```

(excluding output)

---

## Difference

| Problem | Approach |
|---|---|
| Two Sum | HashMap |
| 3Sum | Fix one + Two Pointer |
| 4Sum | Fix two + Two Pointer |

---
