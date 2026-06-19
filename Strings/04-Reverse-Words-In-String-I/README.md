# Reverse Words in a String I

## Pattern

String / Traversal

---

## Problem

Given a string.

Reverse the order of words.

Remove:

- leading spaces
- trailing spaces
- extra spaces between words

---

## Example

Input:

```
the sky is blue
```

Output:

```
blue is sky the
```

---

## Difference From Reverse Words III

Reverse Words III:

```
hello world
↓
olleh dlrow
```

Reverse words:

```
hello world
↓
world hello
```

Here we move **whole words**.

---

## Algorithm

1. Remove extra spaces:

```
trim()
```

2. Split words:

```
split("\\s+")
```

3. Traverse from last word to first.

4. Build answer.

---

## Dry Run

Input:

```
  hello   world
```

After split:

```
[hello, world]
```

Traverse backwards:

```
world hello
```

Output:

```
world hello
```

---

## Time Complexity

Each character processed once:

```
O(n)
```

---

## Space Complexity

Array + output:

```
O(n)
```

---
