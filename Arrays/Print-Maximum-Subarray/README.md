# Print Subarray With Maximum Sum

## Pattern

Kadane's Algorithm

---

## Problem

Given an integer array, print:

1. Maximum subarray sum
2. The actual subarray producing that sum

---

## Example

Input:

```
[-2,1,-3,4,-1,2,1,-5,4]
```

Output:

```
Maximum Sum = 6

Subarray:
[4,-1,2,1]
```

---

## Intuition

Normal Kadane's Algorithm gives only:

```
Maximum Sum
```

To print the subarray also, we must track:

```java
start
end
```

indices of the best subarray.

---

## Algorithm

Maintain:

```java
start
ansStart
ansEnd
```

Whenever:

```java
sum == 0
```

a new subarray begins.

Whenever:

```java
sum > maxSum
```

update:

```java
ansStart = start
ansEnd = current index
```

---

## Dry Run

Input:

```
[-2,1,-3,4,-1,2,1,-5,4]
```

Best sequence found:

```
4
4 + (-1) = 3
3 + 2 = 5
5 + 1 = 6
```

Indices:

```
3 → 6
```

Subarray:

```
[4,-1,2,1]
```

Maximum Sum:

```
6
```

---

## Time Complexity

Single traversal:

```
O(n)
```

Printing subarray:

```
O(length of answer)
```

Overall:

```
O(n)
```

---

## Space Complexity

Only variables used:

```java
sum
maxSum
start
ansStart
ansEnd
```

Therefore:

```
O(1)
```

---

## Key Observation

Kadane's Algorithm already finds the maximum sum.

To print the subarray, we simply remember where the current subarray starts and where the best subarray ends.

---
