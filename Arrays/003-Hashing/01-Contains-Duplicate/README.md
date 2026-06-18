***Contains Duplicate***

**Pattern**

Hashing (HashSet)

---

**Problem**

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

---

**Example**

Input:

```
nums = [1, 2, 3, 1]
```

Output:

```
true
```

Input:

```
nums = [1, 2, 3, 4]
```

Output:

```
false
```

---

**Intuition**

While traversing the array, keep track of all previously seen elements.

If the current element already exists in the HashSet, we have found a duplicate.

---

**Algorithm**

1. Create an empty HashSet.
2. Traverse the array.
3. For each element:
   - If it already exists in the set, return `true`.
   - Otherwise, add it to the set.
4. If traversal completes, return `false`.

---


**Time Complexity**

We traverse the array once.

```
n iterations
```

For each iteration:

```
contains() → O(1)
add() → O(1)
```

Therefore:

```
Time Complexity = O(n)
```

---

**Space Complexity**

In the worst case, all elements are unique.

The HashSet stores:

```
n elements
```

Therefore:

```
Space Complexity = O(n)
```

---
