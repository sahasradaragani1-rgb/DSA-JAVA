# Leaders in an Array

## Pattern

Array Traversal from Right

---

## Problem

An element is called a leader if it is greater than all the elements to its right.

The rightmost element is always a leader.

Return all leaders in the array.

---

## Example

Input:

```
[10,22,12,3,0,6]
```

Output:

```
[22,12,6]
```

Explanation:

```
22 > 12,3,0,6
12 > 3,0,6
6  > none
```

---

## Intuition

Checking every element against all elements on its right would take:

```
O(n²)
```

Instead:

Traverse from right to left and keep track of the maximum element seen so far.

If current element is greater than that maximum, it is a leader.

---

## Algorithm

1. Start from the last element.
2. Store it as:
   ```
   maxRight
   ```
3. Traverse from right to left.
4. If:
   ```
   arr[i] > maxRight
   ```
   then:
   - It is a leader.
   - Update maxRight.
5. Reverse the result.

---

## Dry Run

Input:

```
[10,22,12,3,0,6]
```

Start:

```
maxRight = 6
leaders = [6]
```

Check:

```
0  > 6 ? No
3  > 6 ? No
12 > 6 ? Yes
leaders = [6,12]

22 > 12 ? Yes
leaders = [6,12,22]

10 > 22 ? No
```

Reverse:

```
[22,12,6]
```

---

## Time Complexity

Single traversal:

```
O(n)
```

Reversing leaders list:

```
O(n)
```

Overall:

```
O(n)
```

---

## Space Complexity

Leaders list stores the answer.

```
O(n)
```

---

## Key Observation

While moving from right to left:

```text
Any element greater than the maximum seen so far
must be a leader.
```
