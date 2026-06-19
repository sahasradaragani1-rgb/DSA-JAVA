# Maximum Subarray

## Pattern

Kadane's Algorithm

---

## Problem

Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

---

## Example 1

Input:

```
[-2,1,-3,4,-1,2,1,-5,4]
```

Output:

```
6
```

Explanation:

```
[4,-1,2,1]
```

Sum:

```
6
```

---

## Example 2

Input:

```
[1]
```

Output:

```
1
```

---

## Example 3

Input:

```
[5,4,-1,7,8]
```

Output:

```
23
```

---

## Brute Force

Generate all subarrays.

Compute sum of each subarray.

```java
for(i)
    for(j)
```

Time:

```
O(n²)
```

---

## Optimal Idea

Suppose current running sum becomes:

```
negative
```

Can it help future subarrays?

No.

Because adding a negative sum to future elements only decreases the answer.

Therefore:

```
Discard it.
Start fresh.
```

This is the core idea of Kadane's Algorithm.

---

## Algorithm

1. Maintain:

```java
sum
maxi
```

2. Add current element to sum.

3. Update maximum.

4. If:

```java
sum < 0
```

reset:

```java
sum = 0;
```

---

## Dry Run

Input:

```
[-2,1,-3,4,-1,2,1,-5,4]
```

Process:

```
sum=-2
max=-2
sum=0

sum=1
max=1

sum=-2
sum=0

sum=4
max=4

sum=3
max=4

sum=5
max=5

sum=6
max=6

sum=1

sum=5
```

Answer:

```
6
```

Subarray:

```
[4,-1,2,1]
```

---

## Why Reset When Sum Becomes Negative?

Suppose:

```
Current Sum = -10
```

Future element:

```
5
```

Then:

```
-10 + 5 = -5
```

Worse than:

```
5
```

So carrying a negative sum is never beneficial.

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Only variables used:

```
O(1)
```

---

## Comparison

### Brute Force

```
Time: O(n²)
Space: O(1)
```

---

### Kadane's Algorithm

```
Time: O(n)
Space: O(1)
```

Optimal

---

## Key Observation

If running sum becomes negative:

```java
if(sum < 0)
    sum = 0;
```

because a negative prefix can never help create a larger future sum.

---
