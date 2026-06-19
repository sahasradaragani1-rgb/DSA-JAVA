# Rotate String

## Pattern

String Manipulation

---

## Problem

Given two strings:

```
s
goal
```

Check if `goal` can be obtained by rotating `s`.

---

## Example

Input:

```
s = abcde
goal = cdeab
```

Output:

```
Rotation exists
```

---

## Observation

Any rotation of a string appears inside:

```
s + s
```

Example:

```
abcdeabcde
```

Rotations:

```
abcde
bcdea
cdeab
deabc
eabcd
```

---

## Brute Force

Try every rotation.

Example:

```
rotate one by one
```

Check with goal.

Time:

```
O(n²)
```

---

## Optimal Idea

Create:

```
s + s
```

Then check:

```
goal exists?
```

If yes:

rotation is possible.

---

## Algorithm

1. Check lengths.

2. Create:

```
doubled = s + s
```

3. Use:

```
contains()
```

---

## Dry Run

s:

```
abcde
```

doubled:

```
abcdeabcde
```

goal:

```
cdeab
```

Found inside.

Answer:

```
true
```

---

## Time Complexity

String search:

```
O(n)
```

Overall:

```
O(n)
```

---

## Space Complexity

New string:

```
O(n)
```

---
