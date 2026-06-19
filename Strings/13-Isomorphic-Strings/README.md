# Isomorphic Strings

## Pattern

HashMap / Character Mapping

---

## Problem

Two strings are isomorphic if characters in one string can be replaced to get the other string.

Rules:

- One character maps to only one character
- Two different characters cannot map to same character

---

## Example

Input:

```
egg
add
```

Output:

```
Isomorphic
```

Mapping:

```
e → a
g → d
```

---

## Example 2

Input:

```
foo
bar
```

Output:

```
Not Isomorphic
```

Because:

```
f → b
o → a
o → r
```

Same character maps to two different characters.

---

## Brute Force

Check every character mapping manually.

Time:

```
O(n²)
```

---

## Optimal Idea

Maintain two mappings:

```
s → t
```

and

```
t → s
```

Why two?

Example:

```
ab
cc
```

First map:

```
a → c
b → c
```

is allowed by one map.

But it is invalid because:

two characters map to one character.

---

## Algorithm

For every index:

Take:

```
s[i], t[i]
```

Check:

1. Existing mapping should match.

2. Reverse mapping should also match.

Then store.

---

## Dry Run

Input:

```
paper
title
```

Mappings:

```
p → t
a → i
p → t
e → l
r → e
```

Valid.

Output:

```
Isomorphic
```

---

## Time Complexity

Single traversal:

```
O(n)
```

---

## Space Complexity

HashMaps store characters:

```
O(n)
```

---
