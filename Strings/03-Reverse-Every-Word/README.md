# Reverse Every Word in a String

## Pattern

String Manipulation

---

## Problem

Given a string, reverse every word individually.

The order of words remains the same.

---

## Example

Input:

```
hello world java
```

Output:

```
olleh dlrow avaj
```

---

## Idea

Split the sentence into words.

Example:

```
hello world
```

becomes:

```
[hello, world]
```

Reverse each word:

```
hello → olleh
world → dlrow
```

Join them again.

---

## Algorithm

1. Read string.

2. Split using space:

```
split(" ")
```

3. For every word:

- reverse it
- add to answer

4. Print result.

---

## Dry Run

Input:

```
I love Java
```

Split:

```
I
love
Java
```

Reverse:

```
I
evol
avaJ
```

Output:

```
I evol avaJ
```

---

## Time Complexity

Each character is visited once:

```
O(n)
```

---

## Space Complexity

Stores words and result:

```
O(n)
```

---

## Difference

Reverse String:

```
"abc" → "cba"
```

Reverse Words:

```
"hello world"
→
"olleh dlrow"
```

---
