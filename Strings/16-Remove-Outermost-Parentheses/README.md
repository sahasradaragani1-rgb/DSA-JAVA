# Remove Outermost Parentheses

## Pattern

Stack / Counting Balance

---

## Problem

Remove the outermost parentheses of every primitive valid parentheses group.

---

## Example

Input:

```
(()())(())
```

Output:

```
()()()
```

---

## Observation

A primitive group:

```
( ... )
```

has:

- first `(` as outermost
- last `)` as outermost

Remove only those.

---

## Brute Force

Use stack to find matching brackets.

Remove first and last.

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

Maintain:

```
depth
```

Depth tells nesting level.

Example:

```
( ( ) )
0 1 2 1 0
```

When depth is:

```
0 → opening bracket is outermost
```

When depth becomes:

```
0 → closing bracket is outermost
```

Ignore them.

---

## Algorithm

For each character:

### If '('

If:

```
depth > 0
```

add it.

Increase depth.

---

### If ')'

Decrease depth.

If:

```
depth > 0
```

add it.

---

## Dry Run

Input:

```
(()())
```

Depth:

```
(
1

(
2

)
1

(
2

)
1

)
0
```

Ignore first and last.

Answer:

```
()()
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

Result string:

```
O(n)
```

---
