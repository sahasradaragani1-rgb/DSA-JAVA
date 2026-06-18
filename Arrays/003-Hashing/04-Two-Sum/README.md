# Two Sum

## Pattern

Hashing (HashMap)

---

## Problem

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

You may assume that each input has exactly one solution.

You may not use the same element twice.

---

## Example

Input:

```
nums = [2,7,11,15]
target = 9
```

Output:

```
[0,1]
```

Explanation:

```
nums[0] + nums[1] = 2 + 7 = 9
```

---

## Intuition

For every element:

```
nums[i]
```

we need:

```
target - nums[i]
```

Instead of searching the entire array again, store previously seen numbers in a HashMap.

The HashMap stores:

```
Number → Index
```

This allows O(1) lookup.

---

## Algorithm

1. Create an empty HashMap.
2. Traverse the array.
3. Compute:

```java
complement = target - nums[i];
```

4. If complement exists in the map:
   - Return its index and current index.
5. Otherwise:
   - Store current number and index in the map.
6. Continue until solution is found.

---

## Dry Run

Input:

```
nums = [2,7,11,15]
target = 9
```

Initial:

```
map = {}
```

Iteration 1:

```
num = 2
complement = 7

map = {2=0}
```

Iteration 2:

```
num = 7
complement = 2

2 exists in map
```

Answer:

```
[0,1]
```

---

## Time Complexity

We traverse the array once.

```
n iterations
```

For each iteration:

```
containsKey() → O(1)
put() → O(1)
get() → O(1)
```

Therefore:

```
Time Complexity = O(n)
```

---

## Space Complexity

In the worst case, all elements are stored in the HashMap.

```
n elements
```

Therefore:

```
Space Complexity = O(n)
```

---

## Key Observation

Brute Force:

```java
for(i)
    for(j)
```

Checks every pair.

```
Time Complexity = O(n²)
```

Using a HashMap:

```
Lookup = O(1)
```

reduces the complexity to:

```
O(n)
```

---
