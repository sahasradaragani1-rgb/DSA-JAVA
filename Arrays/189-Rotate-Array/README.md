***Rotate Array***

**Pattern**
Array Reversal

**Problem**

Given an integer array `nums`, rotate the array to the right by `k` steps.


## Example

Input:

```
nums = [1, 2, 3, 4, 5, 6, 7]
k = 3
```

Output:

```
[5, 6, 7, 1, 2, 3, 4]
```

---

**Intuition**

Moving each element one by one takes O(n × k).

Instead:

1. Reverse the entire array.
2. Reverse the first k elements.
3. Reverse the remaining elements.

---

**Algorithm**

1. Compute `k = k % n`
2. Reverse the entire array.
3. Reverse first `k` elements.
4. Reverse remaining elements.
5. Print the rotated array.

---


**Time Complexity**

Three reversals are performed.

```
O(n) + O(n) + O(n)
```

Ignoring constants:

```
O(n)
```

---

**Space Complexity**

Only a few variables are used:

- left
- right
- temp
- k

Therefore:

```
O(1)
```

---
