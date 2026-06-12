**Remove Duplicates from Sorted Array**

**Pattern**
Two Pointers
---
**Problem**

Given a sorted array nums, remove the duplicates in-place such that each unique element appears only once.

Return the number of unique elements.
---
**Intuition**

Since the array is already sorted:

1 1 2 2 3 4 4

Duplicate elements will always be adjacent.

We maintain:

j → scans the array
k → points to the position where the next unique element should be placed

Whenever we find a new unique element:

nums[j] != nums[j - 1]

we copy it to index k and increment k.
---
**Algorithm**

If array is empty, return 0.
Initialize k = 1.
Traverse from index 1 to n-1.
If current element differs from previous:
Place it at index k
Increment k
After traversal, first k elements contain unique values.
---
**Time Complexity**

Loop runs from:

j = 1

to

j = n - 1

Number of iterations:

n - 1 ≈ n

Work done per iteration:

Comparison = O(1)
Assignment = O(1)

Therefore:

Time Complexity = O(n)
---
**Space Complexity**

No extra array is created.

Only variables used:

k
j
n

Constant extra memory:

Space Complexity = O(1)
