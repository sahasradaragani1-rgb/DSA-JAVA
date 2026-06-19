# Maximum Nesting Depth of Parentheses

## Pattern

String / Counting

---

## Problem

Find the maximum number of nested parentheses.

---

## Example

Input:

```
((()))
```

Output:

```
3
```

Because:

```
(
 (
  (
  )
 )
)
```

Maximum nesting = 3

---

## Brute Force

Use stack.

Push every '('.

Pop every ')'.

Stack size gives current depth.

Time:

```
O(n)
```

Space:

```
O(n)
```

---

## Optimal Idea

We don't need actual stack.

Only need the count of open brackets.

Maintain:

```
depth
```

---

## Algorithm

For every character:

If:

```
(
```

increase depth.

Update:

```
maxDepth
```

If:

```
)
```

decrease depth.

---

## Dry Run

Input:

```
(1+(2*3)+((8)/4))+1
```

Depth changes:

```
(
1

(
2

)
1

(
2

(
3

)
2

)
1
```

Maximum:

```
3
```

---

## Time Complexity

One traversal:

```
O(n)
```

---

## Space Complexity

Only variables:

```
O(1)
```

---
